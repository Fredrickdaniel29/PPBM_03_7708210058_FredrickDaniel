package com.example.intinyatugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class Registrasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)
        val backbtn = findViewById<Button>(R.id.Register)
        backbtn.setOnClickListener {
            val back = Intent(this, MainActivity::class.java)
            startActivity(back)
            finish()

        }
        val imageList = ArrayList<SlideModel>() // Create image list

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel("https://pbs.twimg.com/media/Emm95-_VcAAoUg7.jpg:large", "Paying bills is now easier on BNI!!"))
        imageList.add(SlideModel("https://www.bni.co.id/Portals/3/DNNGalleryPro/uploads/2023/6/15/b-qris-kk-bni.jpg", "Easy transaction with QRIS BNI"))
        imageList.add(SlideModel("https://www.domainesia.com/wp-content/uploads/2020/03/11._Panduan_Virtual_Account_Bank_BNI.jpg", "BNI bank virtual account guide!"))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)
    }
}