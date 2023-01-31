package com.example.interactiveapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnDark: Button =findViewById(R.id.btn_dark)
        val btnLight: Button =findViewById(R.id.btn_light)
        val btnRed: Button =findViewById(R.id.btn_red)
        val btnBlue: Button =findViewById(R.id.btn_blue)
        val layout: LinearLayout =findViewById(R.id.linear_layout)
        btnDark.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
        }
        btnLight.setOnClickListener {
            layout.setBackgroundResource(R.color.yellow)
        }
        btnRed.setOnClickListener {
            layout.setBackgroundResource(R.color.red)
        }
        btnBlue.setOnClickListener {
            layout.setBackgroundResource(R.color.blue)
        }
    }
}