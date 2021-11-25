package com.example.foodie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Oatmeal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oatmeal)
    }
    fun pie(view: View) {
        startActivity(Intent(this@Oatmeal,pie::class.java))
    }
    fun sugar(view: View) {
        startActivity(Intent(this@Oatmeal,sugar::class.java))
    }
    fun cream(view: View) {
        startActivity(Intent(this@Oatmeal,cream::class.java))
    }
}