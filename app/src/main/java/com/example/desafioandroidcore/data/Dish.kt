package com.example.desafioandroidcore.data

import androidx.annotation.DrawableRes

data class Dish(
    val id: Int,
    val name: String,
    @DrawableRes
    val image: Int,
    val description: String
)