package com.example.mascotasapp

import android.os.Bundle
import com.example.mascotasapp.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : ActividadConMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //variables para rellenar las bases de datos
        var nombreDuenio = binding.nombrePropietario.text.toString()
        var direccion = binding.direccionPropietario.text.toString()
        var telefono = binding.telefonoPropietario.text.toString()
        var nombreMascota = binding.nombreMascota.text.toString()
        var razaMascota = binding.razaMascota.text.toString()
        var fechaNac = binding.fechaNacMascota.text.toString()
        var esPerro : Boolean
        if (binding.radioGato.isChecked)  esPerro = false
        else esPerro = true

        binding.btnGuardar.setOnClickListener {
            //tengo que hacer que guarde un propietario y su mascota


            CoroutineScope(Dispatchers.IO).launch {

            }
            runOnUiThread { true }

            //después de guardar los datos, limpiará los datos de las mascotas
            binding.nombreMascota.text.clear()
            binding.razaMascota.text.clear()
            binding.fechaNacMascota.text.clear()
            binding.grupoRadio.clearCheck()
        }

        binding.btnOtraMascota.setOnClickListener {
            //tengo que guardar una mascota nueva del propietario
            CoroutineScope(Dispatchers.IO).launch {

            }
                runOnUiThread { true }
        }
    }
}