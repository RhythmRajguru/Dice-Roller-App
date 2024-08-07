package com.rhythm.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class Home : AppCompatActivity() {
    lateinit var diceImage:ImageView
    lateinit var rollButton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        diceImage=findViewById(R.id.dice_image)
        rollButton=findViewById(R.id.roll_btn)

        rollButton.setOnClickListener {

            rollDice()//function called
        }
    }
    fun rollDice() {


        //it will generate 0 to 5 numbers but we need 0 to 6 that's why we added +1
        val drawableResourse=when(java.util.Random().nextInt(6)+1)
        {
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResourse)


    }
}