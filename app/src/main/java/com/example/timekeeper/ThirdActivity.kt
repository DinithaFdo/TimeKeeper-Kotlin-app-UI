package com.example.timekeeper

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val buttonNext: ImageButton = findViewById(R.id.buttonNext)
        val buttonPrevious: ImageButton = findViewById(R.id.buttonPrevious)
        val buttonSkip: Button = findViewById(R.id.skip)

        // Navigate to FourthActivity when Next button is clicked
        buttonNext.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
            startActivity(intent)
        }

        // Navigate back to SecondActivity when Previous button is clicked
        buttonPrevious.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
            startActivity(intent)
        }

        // Navigate to MainActivity when Skip button is clicked
        buttonSkip.setOnClickListener {
            val intent = Intent(this, Dashboard::class.java)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            startActivity(intent)
        }
    }
}