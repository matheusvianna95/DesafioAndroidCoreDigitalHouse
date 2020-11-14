package com.example.desafioandroidcore.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.desafioandroidcore.R
import com.example.desafioandroidcore.databinding.ActivityDishDetailBinding

class DishDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDishDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDishDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val extras = intent.extras
        val dishName = extras?.getString(DISH_NAME)
        val dishImage = extras?.getInt(DISH_IMAGE)
        val dishDescription = extras?.getString(DISH_DESC)

        binding.dishNameDetail.text = dishName
        binding.dishDescriptionDetail.text = dishDescription
        binding.dishImageDetail.setImageResource(dishImage!!)

        val navBar = setSupportActionBar(binding.navBar)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}