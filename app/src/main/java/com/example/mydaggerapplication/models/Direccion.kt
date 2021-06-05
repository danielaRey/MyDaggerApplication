package com.example.mydaggerapplication.models

import javax.inject.Inject

class Direccion @Inject constructor() {
    val calle = "89"
    val provincia = "Cartago"

    fun print(): String {
        return "Mi direccion $calle $provincia"
    }
}