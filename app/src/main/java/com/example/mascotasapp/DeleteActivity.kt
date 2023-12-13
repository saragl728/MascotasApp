package com.example.mascotasapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mascotasapp.databinding.ActivityDeleteBinding


class DeleteActivity : ActividadConMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityDeleteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}