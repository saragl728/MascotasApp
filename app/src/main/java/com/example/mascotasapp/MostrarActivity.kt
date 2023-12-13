package com.example.mascotasapp

import android.os.Bundle
import com.example.mascotasapp.databinding.ActivityMostrarBinding


class MostrarActivity : ActividadConMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMostrarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMostrar.setOnClickListener {
            //tengo que sacar el número de perros y gatos de un propietario

            //hago que se modifique el texto
            binding.numPerros.text = "Número de perros: "
            binding.numGatos.text = "Número de gatos: "
        }
    }
}