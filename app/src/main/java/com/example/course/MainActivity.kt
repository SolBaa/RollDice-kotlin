package com.example.course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)

//       Selecciono el boton y lo asigno a una variable
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val diceImage: ImageView = findViewById(R.id.dice_image)
        diceImage.setOnClickListener { rollDice() }

        val resetButton: Button = findViewById(R.id.countUp_button)
        resetButton.setOnClickListener { reset() }


    }
    private fun rollDice() {
        val randomInt = (1..6).random()
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)

//        Toast.makeText(this, "button clicked",
//            Toast.LENGTH_SHORT).show()
    }
   private fun reset(){
       val diceImage: ImageView = findViewById(R.id.dice_image)
       diceImage.setImageResource(R.drawable.empty_dice)
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text ="0"
//
  }
}