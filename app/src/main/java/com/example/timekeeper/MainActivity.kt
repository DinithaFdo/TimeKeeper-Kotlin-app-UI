package com.example.timekeeper

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the activity to fullscreen mode
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setContentView(R.layout.activity_main)

        // Use Coroutine to introduce a delay of 1 second
        CoroutineScope(Dispatchers.Main).launch {
            delay(1000) // 1 second delay
            // Start SecondActivity
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
            finish() // Optional: to close MainActivity
        }
    }
}
