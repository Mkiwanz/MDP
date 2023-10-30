package com.example.mdp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import java.util.Random

class MainActivity : ComponentActivity() {

    private val foods = arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextFoodName: EditText = findViewById(R.id.editTextFoodName)
        val tvSelectedFood: TextView = findViewById(R.id.textViewSelectedFood)
        val btnAddFood: Button = findViewById(R.id.buttonAddFood)
        val btnDecide: Button = findViewById(R.id.buttonDecide)

        btnAddFood.setOnClickListener {
            val newFood = editTextFoodName.text.toString().trim()
            if (newFood.isNotEmpty()) {
                foods.add(newFood)
                editTextFoodName.text.clear()
            }
        }

        btnDecide.setOnClickListener {
            val randomFood = foods[Random().nextInt(foods.size)]
            tvSelectedFood.text = randomFood
        }
    }
}
