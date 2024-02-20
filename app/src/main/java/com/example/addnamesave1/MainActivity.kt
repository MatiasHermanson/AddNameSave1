package com.example.addnamesave1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.addnamesave1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Button.setOnClickListener {

            val name = binding.editTextName.text.toString()

            if (name.isNotEmpty()) {
                binding.displayNames.append("\n $name \n")
            } else {
                binding.displayNames.text = "No Name Entered"
            }
        }
    }
}