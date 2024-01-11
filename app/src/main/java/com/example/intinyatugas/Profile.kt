package com.example.intinyatugas

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Profile : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutdevelop)

        val backbtn = findViewById<TextView>(R.id.logout)
        backbtn.setOnClickListener {
            val intentback = Intent(this, login::class.java)
            startActivity(intentback)
            finish()
        }
    }
}