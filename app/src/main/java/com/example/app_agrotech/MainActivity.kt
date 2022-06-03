package com.example.app_agrotech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nav_activity_main)

        val btnLogin = findViewById<Button>(R.id.button)

        btnLogin.setOnClickListener {
            openAppHome()
        }


    }

    private fun openAppHome() {
        val intent = Intent(this, intro_notices::class.java)
        startActivity(intent)


    }

}
