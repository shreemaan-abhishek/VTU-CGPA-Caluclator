package com.example.vtucgpacalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Semester : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_semester)
        findViewById<Button>(R.id.third_sem).setOnClickListener{
            startActivity(Intent(this,Calculate::class.java))
        }
    }
}