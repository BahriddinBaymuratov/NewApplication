package com.example.newapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }
}