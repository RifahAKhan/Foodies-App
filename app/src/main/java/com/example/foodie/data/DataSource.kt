package com.example.foodie.data

import com.example.foodie.R
import com.example.foodie.model.details

class DataSource() {
    fun loaddetails() : List<details>{
        return listOf<details>(
            details(R.string.pulao,R.drawable.pulao,R.string.ingredients,R.string.description,R.drawable.pulao),
            details(R.string.pilaf,R.drawable.pilaf,R.string.ingredients,R.string.description,R.drawable.pilaf),
            details(R.string.mushroom,R.drawable.mushroom,R.string.ingredients,R.string.description,R.drawable.mushroom),
            details(R.string.risotto,R.drawable.risotto,R.string.ingredients,R.string.description,R.drawable.risotto),
            details(R.string.schezwan,R.drawable.schezwan,R.string.ingredients,R.string.description,R.drawable.schezwan),
            details(R.string.salad,R.drawable.salad,R.string.ingredients,R.string.description,R.drawable.salad),
            details(R.string.fried,R.drawable.fried,R.string.ingredients,R.string.description,R.drawable.fried),
            details(R.string.wok,R.drawable.wok,R.string.ingredients,R.string.description,R.drawable.wok),
            details(R.string.veggie,R.drawable.veggie,R.string.ingredients,R.string.description,R.drawable.veggie),
            details(R.string.med,R.drawable.med,R.string.ingredients,R.string.description,R.drawable.med),
        )
    }
}