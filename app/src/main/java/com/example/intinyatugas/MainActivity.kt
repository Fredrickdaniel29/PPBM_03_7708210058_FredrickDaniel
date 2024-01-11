package com.example.intinyatugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.intinyatugas.fragments.RiwayatFragment
import com.example.intinyatugas.fragments.HomeFragment
import com.example.intinyatugas.fragments.NotifikasiFragment
import com.example.intinyatugas.fragments.QrFragment
import com.example.intinyatugas.fragments.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val riwayatFragment = RiwayatFragment()
        val notifikasiFragment = NotifikasiFragment()
        val profileFragment = ProfileFragment()
        val qrFragment = QrFragment()
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        makeCurrentFragment(homeFragment)
        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.ic_home -> makeCurrentFragment(homeFragment)
                R.id.ic_history -> makeCurrentFragment(riwayatFragment)
                R.id.ic_notif -> makeCurrentFragment(notifikasiFragment)
                R.id.ic_profile -> makeCurrentFragment(profileFragment)
                R.id.ic_qr -> makeCurrentFragment(qrFragment)
            }
            true
        }


    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()

        }
}
