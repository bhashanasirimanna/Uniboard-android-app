package com.example.uniboard

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class favoritespage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_favoritespage)

        // Find the button by its ID
        val homebutton = findViewById<ImageView>(R.id.Fhomeimage)
        val searchbutton = findViewById<ImageView>(R.id.Fsearchimage)
        val accountbutton = findViewById<ImageView>(R.id.Faccountimage)

        homebutton.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
        }

        searchbutton.setOnClickListener {
            val intent = Intent(this, explorepage::class.java)
            startActivity(intent)
        }

        accountbutton.setOnClickListener {
            val intent = Intent(this, myaccountpage::class.java)
            startActivity(intent)
        }
    }
}