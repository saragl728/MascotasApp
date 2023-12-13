package com.example.mascotasapp.database

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

interface Dao {

    //búsquedas de los números de perros y gatos de los dueños
    @Query("SELECT COUNT(*) FROM mascotas WHERE esPerro = FALSE AND duenio like :nombre")
    fun gatosDePropietarios(nombre:String): Int

    @Query("SELECT COUNT(*) FROM mascotas WHERE esPerro = TRUE AND duenio like :nombre")
    fun perrosDePropietarios(nombre:String): Int
    @Insert
    fun insertarPropietario(propietarios: Propietarios)

    @Query("SELECT * FROM mascotas WHERE duenio LIKE :propietario")
    fun buscarMascotasPropietarios(propietario: String) : Mascotas

    @Delete
    fun borrarMascotaDePropietario(mascotas: Mascotas)

    @Update
    fun actualizarPropietario(propietarios: Propietarios)
}