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
        val textViewSelectedFood: TextView = findViewById(R.id.textViewSelectedFood)
        val buttonAddFood: Button = findViewById(R.id.buttonAddFood)
        val buttonDecide: Button = findViewById(R.id.buttonDecide)

        buttonAddFood.setOnClickListener {
            val newFood = editTextFoodName.text.toString().trim()
            if (newFood.isNotEmpty()) {
                foods.add(newFood)
                editTextFoodName.text.clear()
            }
        }

        buttonDecide.setOnClickListener {
            val randomFood = foods[Random().nextInt(foods.size)]
            textViewSelectedFood.text = randomFood
        }
    }
}
