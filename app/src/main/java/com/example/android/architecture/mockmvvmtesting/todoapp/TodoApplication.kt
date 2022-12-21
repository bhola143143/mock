package com.example.android.architecture.mockmvvmtesting.todoapp

import android.app.Application
import androidx.databinding.ktx.BuildConfig
import com.example.android.architecture.mockmvvmtesting.todoapp.data.source.TasksRepository
import timber.log.Timber
import timber.log.Timber.DebugTree


class TodoApplication : Application() {

    val taskRepository: TasksRepository
        get() = ServiceLocator.provideTasksRepository(this)

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) Timber.plant(DebugTree())
    }
}
