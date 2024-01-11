package com.example.intinyatugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val backbtn = findViewById<Button>(R.id.btnViewBalance)
        backbtn.setOnClickListener {
            val back = Intent(this, Saldo::class.java)
            startActivity(back)
            finish()

        }

    }
}