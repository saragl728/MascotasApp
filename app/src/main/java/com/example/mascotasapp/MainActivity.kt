package com.example.mascotasapp

import android.os.Bundle
import com.example.mascotasapp.databinding.ActivityMainBinding

class MainActivity : ActividadConMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGuardar.setOnClickListener {
            //tengo que hacer que guarde un propietario y su mascota

            //después de guardar los datos, limpiará los datos de las mascotas
            binding.nombreMascota.text.clear()
            binding.razaMascota.text.clear()
            binding.fechaNacMascota.text.clear()
            binding.grupoRadio.clearCheck()
        }

        binding.btnOtraMascota.setOnClickListener {
            //tengo que guardar una mascota nueva del propietario
        }
    }
}