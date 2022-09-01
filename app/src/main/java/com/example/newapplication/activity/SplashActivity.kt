package com.example.newapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.newapplication.R
import com.example.newapplication.activity.manager.SharedPref

class SplashActivity : AppCompatActivity() {
    private lateinit var sharedPref: SharedPref

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        sharedPref = SharedPref(this)
        object : CountDownTimer(2000, 1000) {

            override fun onTick(p0: Long) {}

            override fun onFinish() {
                if (sharedPref.getFinish()) {
                    Intent(this@SplashActivity, HomeActivity::class.java).also {
                        startActivity(it)
                        finish()
                    }
                } else {
                    Intent(this@SplashActivity, MainActivity::class.java).also {
                        startActivity(it)
                        finish()
                    }
                }
            }
        }.start()
    }
}