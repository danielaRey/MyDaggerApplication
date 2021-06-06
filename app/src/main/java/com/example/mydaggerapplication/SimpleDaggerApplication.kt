package com.example.mydaggerapplication

import android.app.Application
import com.example.mydaggerapplication.components.ApplicationComponent
import com.example.mydaggerapplication.components.DaggerApplicationComponent
import com.example.mydaggerapplication.interfaces.ComponentProvider

//implementa la interfaz ComponentProvider y por lo tanto inicializa el miembro component de tipo ApplicationComponent.
class SimpleDaggerApplication : Application(), ComponentProvider {
    override val component: ApplicationComponent by lazy {
        DaggerApplicationComponent.create()
    }

    override fun onCreate() {
        super.onCreate()
    }
}