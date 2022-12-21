package com.example.android.architecture.mockmvvmtesting.todoapp.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.android.architecture.mockmvvmtesting.todoapp.data.Task


@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class ToDatabase : RoomDatabase() {

    abstract fun taskDao(): TasksDao
}
