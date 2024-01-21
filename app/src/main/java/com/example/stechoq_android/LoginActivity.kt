package com.example.stechoq_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        btnBackLoginListener()
        txtRegisterListener()
    }

    private fun btnBackLoginListener() {
        login_image_1.setOnClickListener {
            (Intent(this, MainActivity::class.java))
        }
    }

    private fun txtRegisterListener() {
        txt_register.setOnClickListener {
            (Intent(this, RegisterActivity::class.java))
        }
    }
}