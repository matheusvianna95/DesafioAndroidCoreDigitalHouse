package com.example.desafioandroidcore.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafioandroidcore.R
import com.example.desafioandroidcore.data.Restaurant

class RestaurantAdapter(
    private val restaurantList: List<Restaurant>,
    private val onClick: (Restaurant) -> Unit
) : RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder>() {

    class RestaurantViewHolder(itemView: View, val onClick: (Restaurant) -> Unit) :
        RecyclerView.ViewHolder(itemView) {

        private val restaurantName: TextView = this.itemView.findViewById(R.id.restaurant_name)
        private val restaurantAddress: TextView = this.itemView.findViewById(R.id.restaurant_address)
        private val restaurantClosing: TextView = this.itemView.findViewById(R.id.restaurant_closing)
        private val restaurantImage: ImageView = this.itemView.findViewById(R.id.restaurant_image)
        private var currentRestaurant: Restaurant? = null

        init {
            this.itemView.setOnClickListener {
                currentRestaurant?.let {
                    onClick(it)
                }
            }
        }

        /* Bind restaurant text and image views */
        fun bind(restaurant: Restaurant) {
            currentRestaurant = restaurant

            restaurantName.text = restaurant.name
            restaurantAddress.text = restaurant.address
            restaurantClosing.text = restaurant.closing
            restaurantImage.setImageResource(restaurant.image)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.restaurant_item, parent, false)

        return RestaurantViewHolder(view, onClick)
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        val restaurant = restaurantList[position]
        holder.bind(restaurant)

    }

    override fun getItemCount() = restaurantList.size

}