package com.example.projectdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.projectdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val lastname = listOf<String>(
            "Kopling",
            "Persneleng",
            "ABS"
        )

        binding.buttonInput.setOnClickListener {

            val nama = binding.editTextUsername.text.toString()

            binding.user =   MyName(
                nama,
                lastname.random()

            )

            binding.username.setText(nama)

        }

    }
}