package com.example.dsmdesafio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.text.DecimalFormat

class Ejercicio2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2)

        var btnCalcular: Button = findViewById(R.id.btnCalcular)

        btnCalcular.setOnClickListener{
            var sal = findViewById<EditText>(R.id.txtBoxSal).text.toString().toFloat()
            var neto = sal - (sal * 0.03 + sal * 0.04 + sal * 0.05)

            findViewById<TextView>(R.id.txtResSal).text = "Su Salario Neto es: " + DecimalFormat("#.##").format(neto)
        }
    }
}