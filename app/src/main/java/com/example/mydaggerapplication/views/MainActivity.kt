package com.example.mydaggerapplication.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.mydaggerapplication.R
import com.example.mydaggerapplication.components.DaggerApplicationComponent
import com.example.mydaggerapplication.models.Profile
import com.example.mydaggerapplication.utils.injector
import javax.inject.Inject
import kotlinx.android.synthetic.main.activity_main.*

//accederá al componente ApplicationComponent desde objeto application
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var profile: Profile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        profile = injector.profile
        initUI()
    }

    private fun initUI() {
        txtNombre.text = profile.nombre
        txtCompania.text = profile.compania
        txtProfesion.text = profile.profesion
        txtCorreo.text = profile.correo
    }

    fun saludar(view: View) {
        Toast.makeText(this, profile.saludo(), Toast.LENGTH_SHORT).show()
    }
}