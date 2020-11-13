package com.example.desafioandroidcore.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.desafioandroidcore.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signInClickable.setOnClickListener {
            startActivity(Intent(this@RegisterActivity, LoginActivity::class.java))
            this@RegisterActivity.finish()
        }

        binding.registerButton.setOnClickListener {
            startActivity(Intent(this@RegisterActivity, LoginActivity::class.java))
            this@RegisterActivity.finish()
        }
    }
}