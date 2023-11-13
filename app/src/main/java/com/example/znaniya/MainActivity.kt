package com.example.znaniya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    private val SPLASH_DELAY: Long = 4000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        progressBar.visibility = View.VISIBLE

        Handler().postDelayed({
            progressBar.visibility = View.GONE

            val intent = Intent(this, login::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_DELAY)
    }
}
