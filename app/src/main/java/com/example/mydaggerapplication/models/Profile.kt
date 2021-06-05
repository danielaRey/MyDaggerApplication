package com.example.mydaggerapplication.models

import javax.inject.Inject

class Profile @Inject constructor(dir:Direccion ) {
    val direccion = dir
    val nombre = "Pepe Escalante"
    val profesion = "Gerente de ventas"
    val compania = "Premier Inc."
    val correo = "pepeillo@gmail.com"

    fun saludo(): String {
        direccion.print()
        return "Hola me llamo $nombre y soy $profesion en $compania mi contacto es $correo." + direccion.print()
    }
}