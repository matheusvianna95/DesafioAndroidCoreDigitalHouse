package com.example.desafioandroidcore.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.desafioandroidcore.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerClickable.setOnClickListener {
            startActivity(Intent(this@LoginActivity, RegisterActivity::class.java))
            this@LoginActivity.finish()
        }

        binding.signInButton.setOnClickListener {
            startActivity(Intent(this@LoginActivity, MainActivity::class.java))
        }
    }
}