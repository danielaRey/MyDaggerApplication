package com.example.mydaggerapplication

import android.app.Application
import com.example.mydaggerapplication.components.ApplicationComponent
import com.example.mydaggerapplication.components.DaggerApplicationComponent
import com.example.mydaggerapplication.interfaces.ComponentProvider

class SimpleDaggerApplication : Application(), ComponentProvider {
    override val component: ApplicationComponent by lazy {
        DaggerApplicationComponent.create()
    }

    override fun onCreate() {
        super.onCreate()
    }
}