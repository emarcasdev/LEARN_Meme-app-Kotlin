package com.emarcasdev.a00_app_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MemeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Show the view
        setContentView(R.layout.activity_meme)
    }
}