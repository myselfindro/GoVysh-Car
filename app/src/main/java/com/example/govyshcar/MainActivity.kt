package com.example.govyshcar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    var btnRide: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnRide = findViewById(R.id.btnRide)
        btnRide?.setOnClickListener {
            val intent = Intent(this, Rideconfirmbook::class.java)
            startActivity(intent)
        }
    }
}