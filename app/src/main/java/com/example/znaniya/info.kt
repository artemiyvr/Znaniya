package com.example.znaniya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class info : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_info)

            val nextButton: Button = findViewById(R.id.button2)
            nextButton.setOnClickListener {
                val intent = Intent(this@info, login::class.java)
                startActivity(intent)
            }
        }
    }

