package com.example.a3button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val tvMain = findViewById<TextView>(R.id.print)
        val pri = intent.extras?.get("Text")

        tvMain.text = pri.toString()
    }
}