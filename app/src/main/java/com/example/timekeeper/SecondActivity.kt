package com.example.timekeeper

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val buttonNext: ImageButton = findViewById(R.id.buttonNext)
        val buttonSkip: Button  = findViewById(R.id.skip)

        // Navigate to ThirdActivity when Next button is clicked
        buttonNext.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
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