package com.example.android.diceroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val diceFace: ImageView = findViewById(R.id.dice_image)

        val randomNum = (1..6).random()

        when (randomNum) {
            1 -> diceFace.setImageResource(R.drawable.dice_1)
            2 -> diceFace.setImageResource(R.drawable.dice_2)
            3 -> diceFace.setImageResource(R.drawable.dice_3)
            4 -> diceFace.setImageResource(R.drawable.dice_4)
            5 -> diceFace.setImageResource(R.drawable.dice_5)
            6 -> diceFace.setImageResource(R.drawable.dice_6)
            else -> diceFace.setImageResource(R.drawable.empty_dice)
        }

    }
}
