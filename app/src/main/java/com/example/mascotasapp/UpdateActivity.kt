package com.example.mascotasapp

import android.os.Bundle
import com.example.mascotasapp.databinding.ActivityUpdateBinding


class UpdateActivity : ActividadConMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityUpdateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnActualizar.setOnClickListener {
            //tengo que cambiar la dirección del propietario
        }
    }
}