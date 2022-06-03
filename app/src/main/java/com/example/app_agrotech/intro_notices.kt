package com.example.app_agrotech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.navigation.NavigationView

class intro_notices : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nav_activity_intro_notices)

        val navView = findViewById<NavigationView>(R.id.nav_view)

        navView.setNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.nav_profile->{
                    startActivity( Intent(this@intro_notices , profile_data::class.java))}
                R.id.nav_agregar_parcela->{
                    startActivity( Intent(this@intro_notices , agregar_parcela::class.java))}
                R.id.nav_ver_parcela->{
                    Toast.makeText(this@intro_notices,"No hay parcela disponible",
                        Toast.LENGTH_LONG).show()}
                R.id.nav_agregar_aji->{
                    startActivity( Intent(this@intro_notices , agregar_aji::class.java))}
                R.id.nav_ver_aji->{
                    Toast.makeText(this@intro_notices,"No hay aji disponible",
                        Toast.LENGTH_LONG).show()}
                R.id.nav_temporada->{
                    startActivity( Intent(this@intro_notices,temporada::class.java))}
                R.id.nav_tratamiento->{
                    startActivity( Intent(this@intro_notices,tratamiento::class.java))}

            }
            true
        }
    }


}