package com.example.companioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Registration : AppCompatActivity() {
    private lateinit var updatebutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        updatebutton = findViewById(R.id.signUpbtn)
        updatebutton.setOnClickListener { view ->
            val intent = Intent(this@Registration, profile::class.java)
            // If you want to add transition animations, you can do it here
            startActivity(intent)
        }
    }
}