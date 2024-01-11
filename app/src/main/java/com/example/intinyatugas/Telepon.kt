package com.example.intinyatugas

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intinyatugas.databinding.ActivityTeleponBinding


class Telepon : AppCompatActivity() {

    private lateinit var binding : ActivityTeleponBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTeleponBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val nomor = intent.getStringExtra("nomor")
        val Mobile = intent.getStringExtra("Mobile")


        binding.namaTextView.text = name
        binding.nomorTextView.text = nomor
        binding.mobileTextView.text = Mobile
    }
}