package com.example.uniboard

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Delay starting MainActivity by 5 seconds
        Handler().postDelayed({
            // Create an Intent to start welcome_screen_01
            val intent = Intent(this, welcome_screen_01::class.java)

            // Start welcome_screen_01
            startActivity(intent)

            finish()
        }, 5000) // 5000 milliseconds = 5 seconds
}}