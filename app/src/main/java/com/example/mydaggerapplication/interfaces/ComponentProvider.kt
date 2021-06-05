package com.example.mydaggerapplication.interfaces

import com.example.mydaggerapplication.components.ApplicationComponent

//acceder al componente desde el objeto application que encontramos en las Activities.
// encapsular el acceso al componente que estará dentro de la clase SimpleDaggerApplication.
interface ComponentProvider {
    val component: ApplicationComponent
}