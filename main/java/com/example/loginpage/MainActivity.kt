package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.loginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener(View.OnClickListener {
            if(binding.username.text.toString() == "1zhan" && binding.password.text.toString() == "Qwerty123")
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            else Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
        })
    }
}