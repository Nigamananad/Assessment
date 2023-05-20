package com.example.apnibookproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apnibookproject.databinding.ActivityClientBookBinding
import com.example.apnibookproject.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Thread {
            Thread.sleep(2000)
            startActivity(Intent(this,NavDrawerActivity::class.java))
        }.start()

    }
}