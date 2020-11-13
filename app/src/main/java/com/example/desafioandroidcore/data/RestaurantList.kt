package com.example.desafioandroidcore.data

import android.content.res.Resources
import com.example.desafioandroidcore.R

fun restaurantList(resources: Resources): List<Restaurant> {
    return listOf(
        Restaurant(
            id = 1,
            name = resources.getString(R.string.restaurant1_name),
            address = resources.getString(R.string.restaurant1_address),
            closing = resources.getString(R.string.restaurant1_closing),
            image = R.drawable.restaurant1_image
        ),
        Restaurant(
            id = 2,
            name = resources.getString(R.string.restaurant2_name),
            address = resources.getString(R.string.restaurant2_address),
            closing = resources.getString(R.string.restaurant2_closing),
            image = R.drawable.restaurant2_image
        ),
        Restaurant(
            id = 3,
            name = resources.getString(R.string.restaurant3_name),
            address = resources.getString(R.string.restaurant3_address),
            closing = resources.getString(R.string.restaurant3_closing),
            image = R.drawable.restaurant3_image
        ),
        Restaurant(
            id = 4,
            name = resources.getString(R.string.restaurant4_name),
            address = resources.getString(R.string.restaurant4_address),
            closing = resources.getString(R.string.restaurant4_closing),
            image = R.drawable.restaurant4_image
        )
    )
}