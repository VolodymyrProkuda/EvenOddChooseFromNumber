package com.eocfn.evenoddchoosefromnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a = 59
        val textEvenOdd = findViewById<TextView>(R.id.textViewEvenOdd)
        val textRigtOrNot = findViewById<TextView>(R.id.textRigtOrNot)
        val imgEven = findViewById<ImageView>(R.id.imageViewEven)
        val imgOdd = findViewById<ImageView>(R.id.imageViewOdd)
        textEvenOdd.text = "Choose Even or Odd: $a"

        imgEven.setOnClickListener {

            if (a.mod(2)  == 0) textRigtOrNot.text = "That`s right!!!"
            else textRigtOrNot.text = "Oh no!!!"
            a = (0..99).random()
            textEvenOdd.text = "Choose Even or Odd: $a"
        }

        imgOdd.setOnClickListener {


            if (a.mod(2)  == 1) textRigtOrNot.text = "That`s right!!!"
            else textRigtOrNot.text = "Oh no!!!"
            a = (0..99).random()
            textEvenOdd.text = "Choose Even or Odd: $a"
        }


    }



}