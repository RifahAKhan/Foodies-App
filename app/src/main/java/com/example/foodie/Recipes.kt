package com.example.foodie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Recipes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipes)
    }
    fun oatmeal(view: View) {
        startActivity(Intent(this@Recipes,Oatmeal::class.java))

    }

    fun brownRice(view: View) {
        startActivity(Intent(this@Recipes,BrownRice::class.java))

    }

    fun curry(view: View) {
        startActivity(Intent(this@Recipes,Curry::class.java))

    }

    fun chapati(view: View) {
        startActivity(Intent(this@Recipes,Chapati::class.java))

    }

    fun omelette(view: View) {
        startActivity(Intent(this@Recipes,Omlette::class.java))

    }

    fun snacks(view: View) {
        startActivity(Intent(this@Recipes,Snacks::class.java))

    }
}