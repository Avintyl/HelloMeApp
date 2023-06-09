package com.example.hellomeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvGreeting = findViewById<TextView>(R.id.tv_greeting)
        val btnClickMe = findViewById<Button>(R.id.btn_click_me)
        btnClickMe.setOnClickListener {
            if (TextUtils.isEmpty(tvGreeting.text)) {
                tvGreeting.text = getString(R.string.hello_world)
            } else {
                Toast.makeText(this, getString(R.string.i_have_been_clicked), Toast.LENGTH_SHORT).show()
            }
        }
    }
}