package com.example.uniboard

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class explorepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_explorepage)

        // Find the button by its ID
        val homebutton = findViewById<ImageView>(R.id.Ehomebtnimage)
        val favoritebutton = findViewById<ImageView>(R.id.Efavoriteimage)
        val accountbutton = findViewById<ImageView>(R.id.Eaccountimage)

        homebutton.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
        }

        favoritebutton.setOnClickListener {
            val intent = Intent(this, favoritespage::class.java)
            startActivity(intent)
        }

        accountbutton.setOnClickListener {
            val intent = Intent(this, myaccountpage::class.java)
            startActivity(intent)
        }
    }
}