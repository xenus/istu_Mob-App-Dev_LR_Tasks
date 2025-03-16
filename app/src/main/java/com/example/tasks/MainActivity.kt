package com.example.tasks

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.setOnApplyWindowInsetsListener { _, insets ->
            val systemBars = WindowInsetsCompat.toWindowInsetsCompat(insets).getInsets(WindowInsetsCompat.Type.systemBars())
            val paddingTop = systemBars.top
            val paddingBottom = systemBars.bottom
            val rootView = findViewById<View>(R.id.nav_host_fragment)
            rootView.setPadding(0, paddingTop, 0, paddingBottom)
            insets
        }
    }
}