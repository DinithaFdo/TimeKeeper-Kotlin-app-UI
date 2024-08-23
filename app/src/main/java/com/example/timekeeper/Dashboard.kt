package com.example.timekeeper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class Dashboard : AppCompatActivity() {

    private lateinit var busFragment: bus
    private lateinit var trainFragment: train
    private lateinit var historyFragment: History
    private lateinit var profileFragment: profile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        busFragment = bus()
        trainFragment = train()
        historyFragment = History()
        profileFragment = profile()

        // Set initial fragment
        setCurrentFragment(busFragment)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_bus -> setCurrentFragment(busFragment)
                R.id.nav_train -> setCurrentFragment(trainFragment)
                R.id.nav_history -> setCurrentFragment(historyFragment)
                R.id.nav_profile -> setCurrentFragment(profileFragment)
            }
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, fragment)
            commit()
        }
}
