package com.rhythm.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val rollButton:Button=findViewById(R.id.roll_btn)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val resultText:TextView=findViewById(R.id.result_text)
        resultText.text="Dice Rolled!"
    }
}