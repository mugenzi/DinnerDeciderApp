package com.example.dinnerdeciderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var availableFood = arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        randomFood.text = availableFood[Random().nextInt(availableFood.size)]
    }

    fun add(view: View) {
        try {
            var newFoodInput: String = newFood.text.toString()
            availableFood.add(newFoodInput)
            randomFood.text = availableFood[availableFood.size - 1]
            newFood.text.clear()
        } catch (e: Exception) {

        }
    }

    fun decide(view: View) {
        try {
            randomFood.text = availableFood[Random().nextInt(availableFood.size)]
        } catch (e: Exception) {

        }
    }

}
