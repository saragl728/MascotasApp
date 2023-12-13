package com.example.mascotasapp.database

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update

interface Dao {

    @Insert
    fun insertarPropietario(propietarios: Propietarios)

    @Delete
    fun borrarMascotaDePropietario(propietarios: Propietarios)

    @Update
    fun actualizarPropietario(propietarios: Propietarios)
}