package com.example.roomdbapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")
data class Note(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var noteTitle: String,
    var noteDescription: String
)


