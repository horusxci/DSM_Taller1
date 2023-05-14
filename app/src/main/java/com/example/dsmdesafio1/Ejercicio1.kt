package com.example.dsmdesafio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import java.text.DecimalFormat
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class Ejercicio1 : AppCompatActivity() {
    private lateinit var database: DatabaseReference
    private lateinit var listView: ListView
    private val userList = mutableListOf<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio1)

        database = FirebaseDatabase.getInstance().getReference("notasStudents")
        listView = findViewById(R.id.list_view)

        database.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                userList.clear()
                for (studentSnapshot in dataSnapshot.children) {
                    val student = studentSnapshot.getValue(Student::class.java)
                    userList.add(student!!)
                }
                val adapter = StudentAdapter(this@Ejercicio1, userList)
                listView.adapter = adapter
            }

            override fun onCancelled(databaseError: DatabaseError) {
                // Handle database error
            }
        })

        // Your other code...
    }
}

