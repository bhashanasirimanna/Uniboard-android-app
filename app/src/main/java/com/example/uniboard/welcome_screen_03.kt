package com.example.uniboard

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class welcome_screen_03 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome_screen03)

        // Find the button by its ID
        val button = findViewById<Button>(R.id.continuebtn)

        // Set OnClickListener for the button
        button.setOnClickListener {
            // Create an Intent to start MainActivity2
            val intent = Intent(this, signup::class.java)

            // Start MainActivity2
            startActivity(intent)
        }
    }
}