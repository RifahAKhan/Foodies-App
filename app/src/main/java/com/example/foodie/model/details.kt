package com.example.foodie.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class details (
    @StringRes val stringResourceId: Int,
    @DrawableRes val drawableResourceId: Int,
    @StringRes val ingredients: Int,
    @StringRes val description: Int,
    @DrawableRes val image: Int
)