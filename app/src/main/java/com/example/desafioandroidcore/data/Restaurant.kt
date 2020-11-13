package com.example.desafioandroidcore.data

import androidx.annotation.DrawableRes

data class Restaurant(
    val id: Int,
    val name: String,
    val address: String,
    val closing: String,
    @DrawableRes
    val image: Int
)