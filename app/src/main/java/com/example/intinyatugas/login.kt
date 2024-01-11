package com.example.intinyatugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val backbtn = findViewById<TextView>(R.id.daftar)
        backbtn.setOnClickListener {
            val back = Intent(this, Registrasi::class.java)
            startActivity(back)
            finish()
        }

    }
}