package com.emarcasdev.a00_app_kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Show the view
        setContentView(R.layout.activity_main)

        // Find the button
        val buttonGo = findViewById<Button>(R.id.buttonGoMeme)

        // When the button is touched
        buttonGo.setOnClickListener {
            // Go to the screen Meme
            startActivity(Intent(this, MemeActivity::class.java))
        }
    }
}