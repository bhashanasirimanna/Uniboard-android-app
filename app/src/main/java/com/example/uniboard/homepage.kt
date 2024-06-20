package com.example.uniboard

import android.content.Intent
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)

        // Find the button by its ID
        val searchbutton = findViewById<ImageView>(R.id.searchbtnimage)
        val favoritebutton = findViewById<ImageView>(R.id.favouritebtnimage)
        val myaccountbutton = findViewById<ImageView>(R.id.accountbtnimage)
        val roombutton = findViewById<LinearLayout>(R.id.roomlayout)
        val annexbutton = findViewById<LinearLayout>(R.id.anexxeslayout)

        searchbutton.setOnClickListener {
            val intent = Intent(this, explorepage::class.java)
            startActivity(intent)
        }

        favoritebutton.setOnClickListener {
            val intent = Intent(this, favoritespage::class.java)
            startActivity(intent)
        }

        myaccountbutton.setOnClickListener {
            val intent = Intent(this, accountpage::class.java)
            startActivity(intent)
        }

        roombutton.setOnClickListener {
            val intent = Intent(this, explorepage::class.java)
            startActivity(intent)
        }

        annexbutton.setOnClickListener {
            val intent = Intent(this, explorepage::class.java)
            startActivity(intent)
        }
    }
}