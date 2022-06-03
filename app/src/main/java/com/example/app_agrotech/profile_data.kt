package com.example.app_agrotech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class profile_data : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_data)

        val btnEdit = findViewById<ImageButton>(R.id.ibEdit)

        btnEdit.setOnClickListener {
            openEditActivity()
        }
    }

    private fun openEditActivity() {
        val intent = Intent(this, edit_profile::class.java)
        startActivity(intent)
    }
}