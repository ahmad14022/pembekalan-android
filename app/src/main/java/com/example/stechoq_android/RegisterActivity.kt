package com.example.stechoq_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        txtLoginListener()
        btnBackListener()
    }

    private fun txtLoginListener() {
        txt_login.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

    private fun btnBackListener() {
        register_button_1.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}