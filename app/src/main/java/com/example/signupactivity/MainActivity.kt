package com.example.signupactivity

import android.graphics.Color
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var title = findViewById<TextView>(R.id.title_sign_up)
        var button = findViewById<TextView>(R.id.button)

        button.setOnClickListener {
            var email = findViewById<EditText>(R.id.input_email).text.toString()
            var password = findViewById<EditText>(R.id.input_password).text.toString()

            if (email.isEmpty() && password.isEmpty()) {
                Toast.makeText(this, "Email and Password fields are empty", Toast.LENGTH_SHORT).show()
            } else if (email.isEmpty()) {
                Toast.makeText(this, "Email field is empty", Toast.LENGTH_SHORT).show()
            } else if (password.isEmpty()) {
                Toast.makeText(this, "Password field is empty", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show()
                title.setTextColor(Color.parseColor("#00FF40"))
            }
        }
        }
        }
