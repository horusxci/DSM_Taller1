package com.example.dsmdesafio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.util.Log

lateinit var btnPromedio: Button

class Ejercicio1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio1)

        btnPromedio = findViewById(R.id.btnPromedio)



        btnPromedio.setOnClickListener{
            var n1 = findViewById<EditText>(R.id.txtBoxN1).text.toString().toFloat()
            var n2 = findViewById<EditText>(R.id.txtBoxN2).text.toString().toFloat()
            var n3 = findViewById<EditText>(R.id.txtBoxN3).text.toString().toFloat()
            var n4 = findViewById<EditText>(R.id.txtBoxN4).text.toString().toFloat()
            var n5 = findViewById<EditText>(R.id.txtBoxN5).text.toString().toFloat()

            var prom = ((n1 + n2 + n3 + n4 + n5)/5.0)


            findViewById<TextView>(R.id.txtViewRes).text ="Nota Promedio: " + prom.toString()
        }
    }


}