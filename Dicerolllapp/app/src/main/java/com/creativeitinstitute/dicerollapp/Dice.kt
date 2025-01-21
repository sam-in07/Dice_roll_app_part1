package com.creativeitinstitute.dicerollapp

import android.util.Log

class Dice {
   /*
   // var dicerange = 1..100
    fun roll() : Int{
        // println likhbo naaaaaaaaaa
        //var dicenumber = dicerange.random()
        //Log.d("TAG","DIce Numberrr is $dicenumber") // key & messsage
       // return dicerange.random()

//        var dicerange = (1..100).random()
//       return dicerange
        return (1..100).random()
    }*/
    fun roll(start : Int , end:Int) : Int {
        return (start..end).random()
    }
}