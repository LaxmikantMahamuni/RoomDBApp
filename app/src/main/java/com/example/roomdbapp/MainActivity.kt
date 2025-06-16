package com.example.roomdbapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var buttonInsert: Button
    private lateinit var buttonShow: Button
    private val viewModel: UserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        editTextName = findViewById(R.id.editTextName)
        buttonInsert = findViewById(R.id.buttonInsert)
        buttonShow = findViewById(R.id.buttonShow)

        buttonInsert.setOnClickListener {
            val name = editTextName.text.toString()
            if (name.isNotEmpty()) {
                viewModel.insert(User(name = name))
                Toast.makeText(this, "Inserted!", Toast.LENGTH_SHORT).show()
                editTextName.text.clear()
            } else {
                Toast.makeText(this, "Please enter a name", Toast.LENGTH_SHORT).show()
            }
        }

        buttonShow.setOnClickListener {

        }

        viewModel.allUsers.observe(this) { users ->
            Toast.makeText(this@MainActivity, "Please enter a name $users", Toast.LENGTH_SHORT).show()
        }
    }
}