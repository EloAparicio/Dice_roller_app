package com.elap.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val acceptButton: Button = findViewById(R.id.accept_button)
        acceptButton.text = "Aceptar"
        acceptButton.setOnClickListener{
            Toast.makeText(this,"Hiciste click", Toast.LENGTH_SHORT).show()
        }
    }
}
