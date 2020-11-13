package com.example.desafioandroidcore.data

import android.content.res.Resources
import com.example.desafioandroidcore.R

fun dishList(resources: Resources): List<Dish> {
    return listOf(
        Dish(
            id = 1,
            name = resources.getString(R.string.dish_name_placeholder),
            image = R.drawable.dish_image_placeholder,
            description = resources.getString(R.string.dish_description_placeholder)
        ),
        Dish(
            id = 2,
            name = resources.getString(R.string.dish_name_placeholder),
            image = R.drawable.dish_image_placeholder,
            description = resources.getString(R.string.dish_description_placeholder)
        ),
        Dish(
            id = 3,
            name = resources.getString(R.string.dish_name_placeholder),
            image = R.drawable.dish_image_placeholder,
            description = resources.getString(R.string.dish_description_placeholder)
        ),
        Dish(
            id = 4,
            name = resources.getString(R.string.dish_name_placeholder),
            image = R.drawable.dish_image_placeholder,
            description = resources.getString(R.string.dish_description_placeholder)
        ),
        Dish(
            id = 5,
            name = resources.getString(R.string.dish_name_placeholder),
            image = R.drawable.dish_image_placeholder,
            description = resources.getString(R.string.dish_description_placeholder)
        ),
        Dish(
            id = 6,
            name = resources.getString(R.string.dish_name_placeholder),
            image = R.drawable.dish_image_placeholder,
            description = resources.getString(R.string.dish_description_placeholder)
        ),
        Dish(
            id = 7,
            name = resources.getString(R.string.dish_name_placeholder),
            image = R.drawable.dish_image_placeholder,
            description = resources.getString(R.string.dish_description_placeholder)
        ),
        Dish(
            id = 8,
            name = resources.getString(R.string.dish_name_placeholder),
            image = R.drawable.dish_image_placeholder,
            description = resources.getString(R.string.dish_description_placeholder)
        ),
        Dish(
            id = 9,
            name = resources.getString(R.string.dish_name_placeholder),
            image = R.drawable.dish_image_placeholder,
            description = resources.getString(R.string.dish_description_placeholder)
        ),
        Dish(
            id = 10,
            name = resources.getString(R.string.dish_name_placeholder),
            image = R.drawable.dish_image_placeholder,
            description = resources.getString(R.string.dish_description_placeholder)
        )
    )
}