package com.example.foodie.data

import com.example.foodie.R
import com.example.foodie.model.details

class DataSource() {
    fun loaddetails() : List<details>{
        return listOf<details>(
            details(R.string.pulao,R.drawable.pulao,R.string.ingredients1,R.string.description1,R.drawable.pulao),
            details(R.string.pilaf,R.drawable.pilaf,R.string.ingredients2,R.string.description2,R.drawable.pilaf),
            details(R.string.mushroom,R.drawable.mushroom,R.string.ingredients3,R.string.description3,R.drawable.mushroom),
            details(R.string.risotto,R.drawable.risotto,R.string.ingredients4,R.string.description4,R.drawable.risotto),
            details(R.string.schezwan,R.drawable.schezwan,R.string.ingredients5,R.string.description5,R.drawable.schezwan),
            details(R.string.salad,R.drawable.salad,R.string.ingredients6,R.string.description6,R.drawable.salad),
            details(R.string.fried,R.drawable.fried,R.string.ingredients7,R.string.description7,R.drawable.fried),
            details(R.string.wok,R.drawable.wok,R.string.ingredients8,R.string.description8,R.drawable.wok),
            details(R.string.veggie,R.drawable.veggie,R.string.ingredients9,R.string.description9,R.drawable.veggie),
            details(R.string.med,R.drawable.med,R.string.ingredients10,R.string.description10,R.drawable.med),
        )
    }
}