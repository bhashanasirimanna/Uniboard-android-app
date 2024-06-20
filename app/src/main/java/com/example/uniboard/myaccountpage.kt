package com.example.uniboard

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class myaccountpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_myaccountpage)

        // Find the button by its ID
        val homebutton = findViewById<ImageView>(R.id.Ahomeimage)
        val favoritebutton = findViewById<ImageView>(R.id.Afavoriteimage)
        val searchbutton = findViewById<ImageView>(R.id.Asearchimage)

        homebutton.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
        }

        favoritebutton.setOnClickListener {
            val intent = Intent(this, favoritespage::class.java)
            startActivity(intent)
        }

        searchbutton.setOnClickListener {
            val intent = Intent(this, explorepage::class.java)
            startActivity(intent)
        }
    }
}