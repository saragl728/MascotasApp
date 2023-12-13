package com.example.mascotasapp

import android.os.Bundle
import com.example.mascotasapp.database.Dao
import com.example.mascotasapp.database.Mascotas
import com.example.mascotasapp.databinding.ActivityMostrarBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MostrarActivity : ActividadConMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMostrarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //se usará para cambiar el texto, su valor cambiará cuando se haga la búsqueda
        var numeroPerros = 0
        var numeroGatos = 0

        binding.btnMostrar.setOnClickListener {

            //tengo que sacar el número de perros y gatos de un propietario
            numeroGatos = this.buscarGatos(duenio = binding.nPropietario.text.toString())
            numeroPerros = this.buscarPerros(duenio = binding.nPropietario.text.toString())

            //hago que se modifique el texto
            binding.numPerros.text = "Número de perros: " + numeroPerros
            binding.numGatos.text = "Número de gatos: " + numeroGatos
        }

    }
    fun buscarGatos(duenio: String) : Int {
        var gatos = 0
        //tengo que hacer que llame al método que busca el número de gatos del propietario
        CoroutineScope(Dispatchers.IO).launch {
            gatos = com.example.mascotasapp.database.Dao.gatosDePropietarios(duenio)
        }
        return gatos
    }

    fun buscarPerros(duenio: String) : Int {
        var perros = 0
        //tengo que llamar al método que busca el número de perros del propietario
        CoroutineScope(Dispatchers.IO).launch {
            perros = com.example.mascotasapp.database.Dao.perrosDePropietarios(duenio)
        }
        return perros
    }
}