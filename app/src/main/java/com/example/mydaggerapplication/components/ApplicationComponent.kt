package com.example.mydaggerapplication.components

import com.example.mydaggerapplication.models.Profile
import dagger.Component
import javax.inject.Singleton

//permite proveer una instancia de tipo Profile a las Clases que tengan acceso al componente
@Component
@Singleton
interface ApplicationComponent {//clase para acceder a las dependencias.
    val profile: Profile
}