package com.example.dsmdesafio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main,menu)
        return  true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.menuOp1-> {
                val intent = Intent(this, Ejercicio1::class.java)
                startActivity(intent)
            }
            R.id.menuOp2-> {
                val intent = Intent(this, Ejercicio2::class.java)
                startActivity(intent)
            }

        }
        startActivity(intent)

        return true
    }


}