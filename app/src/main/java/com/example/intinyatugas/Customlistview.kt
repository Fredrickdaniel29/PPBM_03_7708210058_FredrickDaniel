package com.example.intinyatugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.intinyatugas.Adapter
import com.example.intinyatugas.R
import com.example.intinyatugas.databinding.ActivityCustomlistviewBinding


class Customlistview : AppCompatActivity() {

    private lateinit var binding: ActivityCustomlistviewBinding
    private lateinit var TeleponArrayList : ArrayList<datafav>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomlistviewBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val name = arrayOf(
            "Prabowo",
            "Ganjar",
            "Anies",
            "Jokowi",
            "Gibran"
        )


        val nomor = arrayOf(
            "+628923000",
            "+628924000",
            "+628925000",
            "+628926000",
            "+628927000"
        )

        val mobile = arrayOf(
            "Mobile",
            "Old number",
            "New number",
            "Mobile",
            "Old number"
        )

        TeleponArrayList = ArrayList()

        for (i in name.indices){

            val user = datafav(name[i], nomor[i], mobile[i])
            TeleponArrayList.add(user)
        }
        binding.listview.isClickable = true
        binding.listview.adapter = Adapter(this, TeleponArrayList)
        binding.listview.setOnItemClickListener { parent, view, position, id ->

            val name = name[position]
            val nomor = nomor[position]
            val mobile = mobile[position]

            val i = Intent(this, Telepon::class.java)
            i.putExtra("name",name)
            i.putExtra("nomor",nomor)
            i.putExtra("Mobile",mobile)
            startActivity(i)

        }
    }
}