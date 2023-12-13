package com.example.mascotasapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mascotasapp.databinding.ActivityMainBinding

class MainActivity : ActividadConMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}