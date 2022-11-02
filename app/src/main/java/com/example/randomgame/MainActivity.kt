package com.example.randomgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.randomgame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvRandom.setOnClickListener {
            binding.tvRandom.text = getRandom()
        }
    }
    private fun randomNumber(): Int{
        val size = resources.getStringArray(R.array.randomItem).size-1
        return (0..size).random()
    }
    private fun getRandom(): String {
        return resources.getStringArray(R.array.randomItem)[randomNumber()]
    }


}