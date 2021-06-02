package com.example.vtucgpacalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result2)

        findViewById<TextView>(R.id.result).text = intent.getFloatExtra("gpa",9.0f).toString()
    }
}