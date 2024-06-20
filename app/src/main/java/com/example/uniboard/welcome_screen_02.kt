package com.example.uniboard

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class welcome_screen_02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome_screen02)

        // Find the button by its ID
        val button = findViewById<Button>(R.id.next)

        // Set OnClickListener for the button
        button.setOnClickListener {
            // Create an Intent to start MainActivity2
            val intent = Intent(this, welcome_screen_03::class.java)

            // Start MainActivity2
            startActivity(intent)
        }
    }
}