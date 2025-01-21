package com.creativeitinstitute.dicerollapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var showDiceNumber  : TextView
    lateinit var showDiceMessage : TextView
    lateinit var rollBtn: Button
    val lucknum = 777
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var dice = Dice()

        showDiceNumber = findViewById(R.id.showDiceNumber)
        showDiceMessage = findViewById(R.id.showDiceMessage)
        rollBtn = findViewById(R.id.rollBtn)

        rollBtn.setOnClickListener {
            //dice.roll()
            var  roolnumber = dice.roll(1,90000000)
            if(roolnumber== lucknum) {
               // showDiceNumber.text = "you won mangiiiiiiii"
                showDiceMessage.text = "you won mangiiiiiiii"
            }
            else if(roolnumber%2==0) {
                showDiceMessage.text = " mangiiiiiiii its even  "
            }
            else {
               // showDiceNumber.text = "you lost  mangiiiiiiii ${roolnumber}"
                showDiceMessage.text = "you lost  mangiiiiiiii "
            }
           // showDiceNumber.text = "Dice Number is ${dice.roll(1,90000000)}"
            showDiceNumber.text = roolnumber.toString()
        }
    }
}