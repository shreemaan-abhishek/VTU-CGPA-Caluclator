package com.example.vtucgpacalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Calculate : AppCompatActivity() {
    private lateinit var calculate: Button

    private lateinit var first : EditText
    private lateinit var second : EditText
    private lateinit var third : EditText
    private lateinit var fourth : EditText
    private lateinit var fifth : EditText
    private lateinit var sixth : EditText
    private lateinit var eighth : EditText
    private lateinit var ninth : EditText
    private lateinit var seventh : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)

        calculate = findViewById(R.id.calculate)
        first = findViewById(R.id.math  )
        second = findViewById(R.id.second )
        third = findViewById(R.id.third  )
        fourth = findViewById(R.id.fourth )
        fifth = findViewById(R.id.fifth  )
        sixth = findViewById(R.id.sixth  )
        eighth = findViewById(R.id.eighth )
        ninth = findViewById(R.id.ninth  )
        seventh = findViewById(R.id.seventh)
        calculate.setOnClickListener{
            // TODO check if the given inputs are in the range of 0 to 100
            val a =getGradePoints(Integer.parseInt(first.text.toString())).toFloat()
            val b =getGradePoints(Integer.parseInt(second.text.toString())).toFloat()
            val c =getGradePoints(Integer.parseInt(third .text.toString())).toFloat()
            val d =getGradePoints(Integer.parseInt(fourth.text.toString())).toFloat()
            val e =getGradePoints(Integer.parseInt(fifth.text.toString())).toFloat()
            val f =getGradePoints(Integer.parseInt(sixth.text.toString())).toFloat()
            val h =getGradePoints(Integer.parseInt(eighth.text.toString())).toFloat()
            val i =getGradePoints(Integer.parseInt(ninth.text.toString())).toFloat()
            val g =getGradePoints(Integer.parseInt(seventh.text.toString())).toFloat()

            val gpa: Float = ((a+c+d+e+f)*3+b*4+(g+h)*2+i)/24
            val intent = Intent(this, Result::class.java)
            intent.putExtra("gpa",gpa)
            startActivity(intent)
        }
    }
    private fun getGradePoints(marks: Int) =
        when{
            marks >= 90 -> 10
            marks in 80..89 -> 9
            marks in 70..79 -> 8
            marks in 60..69 -> 7
            marks in 45..59 -> 6
            marks in 40..44 -> 5
            else -> 0
        }
}