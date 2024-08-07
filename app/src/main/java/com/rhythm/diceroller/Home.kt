package com.rhythm.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val rollButton:Button=findViewById(R.id.roll_btn)

        rollButton.setOnClickListener {
            rollDice()//function called
        }
    }

    private fun rollDice() {
        val resultText:TextView=findViewById(R.id.result_text)
        val randomInt=java.util.Random().nextInt(6)+1
        //it will generate 0 to 5 numbers but we need 0 to 6 that's why we added +1
        resultText.text=randomInt.toString()//int converted into String
    }
}