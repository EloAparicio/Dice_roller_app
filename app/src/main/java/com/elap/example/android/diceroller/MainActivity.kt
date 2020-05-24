package com.elap.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val acceptButton: Button = findViewById(R.id.accept_button)
        acceptButton.text = "Aceptar"
        acceptButton.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        val randomNumber = Random().nextInt(6) + 1
        resultText.text = randomNumber.toString()

    }
}
