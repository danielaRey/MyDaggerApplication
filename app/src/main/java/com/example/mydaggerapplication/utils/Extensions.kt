package com.example.mydaggerapplication.utils

import android.app.Activity
import com.example.mydaggerapplication.interfaces.ComponentProvider


//facilitar el acceso a todas las Activities para acceder al componente ApplicationComponent
//desde la clase SimpleDaggerApplication.
val Activity.injector get() = (application as ComponentProvider).component