package com.example.desafioandroidcore.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafioandroidcore.R
import com.example.desafioandroidcore.data.Dish

class DishAdapter(
    private val dishList: List<Dish>,
    private val onClick: (Dish) -> Unit
) : RecyclerView.Adapter<DishAdapter.DishViewHolder>() {

    class DishViewHolder(itemView: View, val onClick: (Dish) -> Unit) :
        RecyclerView.ViewHolder(itemView) {

        private val dishName: TextView = this.itemView.findViewById(R.id.dish_name)
        private val dishImage: ImageView = this.itemView.findViewById(R.id.dish_image)
        private var currentDish: Dish? = null

        init {
            this.itemView.setOnClickListener {
                currentDish?.let {
                    onClick(it)
                }
            }
        }

        /* Bind dish text and image views */
        fun bind(dish: Dish) {
            currentDish = dish

            dishName.text = dish.name
            dishImage.setImageResource(dish.image)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.dish_item, parent, false)

        return DishViewHolder(view, onClick)
    }

    override fun onBindViewHolder(holder: DishViewHolder, position: Int) {
        val restaurant = dishList[position]
        holder.bind(restaurant)

    }

    override fun getItemCount() = dishList.size

}