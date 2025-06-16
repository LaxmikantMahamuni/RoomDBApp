package com.example.roomdbapp

import androidx.room.Dao
import androidx.room.Query

@Dao
interface NoteDao {

    @Query("Select * from notes_table where id = :id")
    fun getNoteForNoteId(id: Int): Note
}