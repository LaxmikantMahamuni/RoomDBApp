package com.example.roomdbapp

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserViewModel(application: Application) : AndroidViewModel(application) {
    private val userDao = AppDatabase.getDatabase(application).userDao()

    fun insert(user: User) {
        viewModelScope.launch(Dispatchers.IO) {
            userDao.insert(user)
        }
    }


    val allUsers: LiveData<List<User>> = userDao.getAllUsers()

}