package com.example.intinyatugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class aboutdevelop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutdevelop)


        val btn_saldo = findViewById<Button>(R.id.back)

        btn_saldo.setOnClickListener{
            val intent = Intent(this, com.example.intinyatugas.MainActivity::class.java)
            startActivity(intent)
    }
    }
}