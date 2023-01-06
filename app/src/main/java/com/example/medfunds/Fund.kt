package com.example.medfunds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fund : AppCompatActivity() {
    private lateinit var btn2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fund)

        btn2 = findViewById(R.id.btn2)

        btn2.setOnClickListener {
            val intent = Intent(this, Funds::class.java)
            startActivity(intent)
        }
    }
}