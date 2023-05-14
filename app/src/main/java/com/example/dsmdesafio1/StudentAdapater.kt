package com.example.dsmdesafio1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class StudentAdapter(private val context: Context, private val studentList: List<Student>)
    : ArrayAdapter<Student>(context, 0, studentList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        if(itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        }

        val student = studentList[position]

        val nameTextView = itemView!!.findViewById<TextView>(R.id.text_view_name)
        nameTextView.text = student.name

        // Set the data for other views in your item layout
        // ...

        return itemView
    }
}
