package com.example.mascotasapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mascotasapp.databinding.ActivityMostrarBinding


class MostrarActivity : ActividadConMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMostrarBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}