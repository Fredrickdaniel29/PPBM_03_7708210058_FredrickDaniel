package com.example.intinyatugas

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior

class Saldo : AppCompatActivity() {
    private lateinit var bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saldo)

        // Inisialisasi bottomSheetBehavior
        bottomSheetBehavior = BottomSheetBehavior.from(findViewById(R.id.bottomSheet))

        val backbtn = findViewById<ImageView>(R.id.backbtn)
        backbtn.setOnClickListener {
            val back = Intent(this, MainActivity::class.java)
            startActivity(back)
            finish()
        }

        // Menggunakan ID linear layout game untuk menampilkan bottom sheet
        val linearGame = findViewById<ImageView>(R.id.send)
        linearGame.setOnClickListener {
            showBottomSheet()
        }

        // Inisialisasi bottomSheetBehavior
        bottomSheetBehavior = BottomSheetBehavior.from(findViewById(R.id.bottomSheet))

        bottomSheetBehavior.addBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                // Tambahkan logika yang sesuai jika diperlukan
            }

            override fun onStateChanged(bottomSheet: View, newState: Int) {
                // Tambahkan logika yang sesuai berdasarkan newState
                // Misalnya, Anda dapat mengubah teks pada buttonBottomSheetPersistent
            }
        })
    }

    // Metode untuk menampilkan bottom sheet
    private fun showBottomSheet() {
        bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
    }
}
