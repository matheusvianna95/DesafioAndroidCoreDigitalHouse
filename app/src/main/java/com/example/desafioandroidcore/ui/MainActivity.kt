package com.example.desafioandroidcore.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.desafioandroidcore.R
import com.example.desafioandroidcore.data.Restaurant
import com.example.desafioandroidcore.data.restaurantList

const val RESTAURANT_ID = "restaurant_id"

class MainActivity : AppCompatActivity() {
    private lateinit var restaurantList: List<Restaurant>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        restaurantList = restaurantList(resources)

        val restaurantAdapter = RestaurantAdapter(restaurantList, { restaurant -> adapterOnClick(restaurant) })
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = restaurantAdapter
    }

    private fun adapterOnClick(restaurant: Restaurant) {
        val intent = Intent(this, RestaurantMenuActivity()::class.java)
        intent.putExtra(RESTAURANT_ID, restaurant.id)
        startActivity(intent)

    }
}