package com.example.znaniya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val nextButton: Button = findViewById(R.id.button5)
        nextButton.setOnClickListener {
            // Создаем Intent для перехода на следующую активность
            val intent = Intent(this@login, info::class.java)
            startActivity(intent)
        }
    }
}
