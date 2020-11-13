package com.example.desafioandroidcore.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.desafioandroidcore.data.Dish
import com.example.desafioandroidcore.data.dishList
import com.example.desafioandroidcore.databinding.ActivityRestaurantMenuBinding

const val DISH_ID = "dish_id"
const val DISH_NAME = "dish_name"
const val DISH_IMAGE = "dish_image"
const val DISH_DESC = "dish_desc"

class RestaurantMenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRestaurantMenuBinding
    private lateinit var dishList: List<Dish>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRestaurantMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dishList = dishList(resources)

        val extras = intent.extras
        val restaurantName = extras?.getString(RESTAURANT_NAME)
        val restaurantImage = extras?.getInt(RESTAURANT_IMAGE)

        val dishAdapter = DishAdapter(dishList, { dish -> adapterOnClick(dish) })
        val recyclerView: RecyclerView = binding.dishRecyclerView
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = dishAdapter

        binding.restaurantNameMenu.text = restaurantName
        binding.restaurantImageMenu.setImageResource(restaurantImage!!)
    }

    private fun adapterOnClick(dish: Dish) {
        val intent = Intent(this, DishDetailActivity()::class.java)
        intent.putExtra(DISH_ID, dish.id)
        intent.putExtra(DISH_NAME, dish.name)
        intent.putExtra(DISH_IMAGE, dish.image)
        intent.putExtra(DISH_DESC, dish.description)
        startActivity(intent)

    }
}