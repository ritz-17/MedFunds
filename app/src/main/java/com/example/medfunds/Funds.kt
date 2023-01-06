package com.example.medfunds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Funds : AppCompatActivity() {
    private lateinit var btn3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_funds)

        btn3 = findViewById(R.id.btn3)

        btn3.setOnClickListener {
            val intent = Intent(this, Contact::class.java)
            startActivity(intent)
        }
    }
}