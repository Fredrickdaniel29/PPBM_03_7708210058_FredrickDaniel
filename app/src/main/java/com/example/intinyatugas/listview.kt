package com.example.intinyatugas// MainActivity.kt
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.intinyatugas.R
import com.example.intinyatugas.R.*

class listview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_listview)

        val listView = this.findViewById<ListView>(id.listView)

        // Daftar item untuk ditampilkan di ListView
        val items = arrayOf("Customer Service", "Setting", "Bantuan")

        // Adapter untuk menangani data ke ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)


        listView.adapter = adapter

        // Memberikan respons ketika item ListView diklik
        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = items[position]
            Toast.makeText(this, "Anda memilih: $selectedItem", Toast.LENGTH_SHORT).show()
            // Tambahkan logika atau aksi sesuai dengan item yang dipilih
        }
    }
}