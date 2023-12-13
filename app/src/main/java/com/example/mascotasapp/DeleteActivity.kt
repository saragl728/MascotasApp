package com.example.mascotasapp

import android.os.Bundle
import com.example.mascotasapp.database.Mascotas
import com.example.mascotasapp.databinding.ActivityDeleteBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class DeleteActivity : ActividadConMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityDeleteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var duenio = binding.escribePropietario.text.toString() //se necesita para la búsqueda

        binding.btonEliminar.setOnClickListener {
            //tengo que quitar las mascotas de un propietario
            CoroutineScope(Dispatchers.IO).launch {
                //crearía un array con las mascotas que se va a eliminar si me dejara acceder a la función
                val animalesBorrables : Mascotas = com.example.mascotasapp.database.Dao.buscarMascotasPropietarios(duenio)

                //borraría las mascotas del resultado de la consulta si me dejara acceder a la función
                com.example.mascotasapp.database.Dao.borrarMascotasDePropietarios(animalesBorrables)
            }
        }
    }
}