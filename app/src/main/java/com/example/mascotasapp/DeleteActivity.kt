package com.example.mascotasapp

import android.os.Bundle
import com.example.mascotasapp.databinding.ActivityDeleteBinding


class DeleteActivity : ActividadConMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityDeleteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btonEliminar.setOnClickListener {
            //tengo que quitar las mascotas de un propietario
        }
    }
}