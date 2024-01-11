package com.example.intinyatugas

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class Adapter (private val context: Activity,
                                    private val arrayList: ArrayList<datafav>) : ArrayAdapter<datafav>(context,
    R.layout.favourite,arrayList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater: LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.favourite, null)
        val username : TextView = view.findViewById(R.id.editText1)
        val nomor : TextView = view.findViewById(R.id.editText2)

        username.text = arrayList[position].name
        nomor.text = arrayList[position].nomor
        return view
    }

}