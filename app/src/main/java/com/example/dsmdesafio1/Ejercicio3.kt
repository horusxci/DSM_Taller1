package com.example.dsmdesafio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import org.w3c.dom.Text

class Ejercicio3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3)

        var btnOperar = findViewById<Button>(R.id.btnOperar)
        var operGrp = findViewById<RadioGroup>(R.id.rdioGrpOperadores)
        var resView = findViewById<TextView>(R.id.txtViewResOper)

        btnOperar.setOnClickListener{
            var num1:Float = findViewById<EditText>(R.id.edTxtNum1).text.toString().toFloat()
            var num2:Float = findViewById<EditText>(R.id.edTxtNum2).text.toString().toFloat()
            var res = ""
            when(operGrp.checkedRadioButtonId){
                R.id.rdBtnSuma      -> res = (num1+num2).toString()
                R.id.rdBtnResta     -> res = (num1-num2).toString()
                R.id.rdBtnProduct   -> res = (num1*num2).toString()
                R.id.rdBtnDivision  -> res = if(num2 != 0f) (num1/num2).toString() else "Division entre 0"
            }
            resView.text = res

        }
    }
}