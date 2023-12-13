package com.example.mascotasapp

import android.content.Intent
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

open class ActividadConMenus : AppCompatActivity() {
    companion object {
        var actividadActual = 0
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //esto servirá para que podamos cambiar de actividad en el menú
        val inflater : MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)

        //se desactiva la opción en la que estamos
        for (i in 0 until menu?.size()!!){
            if (i == actividadActual) menu.getItem(i).isEnabled = false
            else menu.getItem(i).isEnabled = true
        }
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //esto servirá para cambiar de actividad
        return when (item.itemId){
            R.id.anyadirMascota -> {
                val intent = Intent(this, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
                actividadActual = 0;
                startActivity(intent)
                true
            }

            R.id.eliminarMascotas -> {
                val intent = Intent(this, DeleteActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
                actividadActual = 1;
                startActivity(intent)
                true
            }

            R.id.actualizarMascotas -> {
                val intent = Intent(this, UpdateActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
                actividadActual = 2;
                startActivity(intent)
                true
            }

            R.id.mostrarNumMascotas -> {
                val intent = Intent(this, MostrarActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
                actividadActual = 3;
                startActivity(intent)
                true
            }

            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }
}