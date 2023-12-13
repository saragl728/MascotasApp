package com.example.mascotasapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mascotasapp.databinding.ActivityUpdateBinding


class UpdateActivity : ActividadConMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityUpdateBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}