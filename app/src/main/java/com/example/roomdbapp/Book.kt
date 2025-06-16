package com.example.roomdbapp

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "book",
    foreignKeys = [ForeignKey(
        entity = User::class,
        parentColumns = ["id"],
        childColumns = ["userId"],
        onDelete = ForeignKey.CASCADE
    )]
)
data class Book(
    @PrimaryKey(autoGenerate = true) val bookId: Int = 0,
    val title: String,
    val userId: Int // Foreign key referencing User.id
)
