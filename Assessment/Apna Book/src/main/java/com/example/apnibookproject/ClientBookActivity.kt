package com.example.apnibookproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apnibookproject.databinding.ActivityClientBookBinding

class ClientBookActivity : AppCompatActivity() {
    lateinit var binding: ActivityClientBookBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityClientBookBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}