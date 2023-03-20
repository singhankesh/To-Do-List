package com.appymize.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        val taskList = arrayListOf<String>()

        taskList.add("Meditation")
        taskList.add("Gym")
        taskList.add("Study")
        taskList.add("College")
        taskList.add("Coding")
        taskList.add("Coding")
        taskList.add("Coding")
        taskList.add("Coding")
        taskList.add("Coding")
        taskList.add("Coding")
        taskList.add("Coding")

        var taskListAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, taskList)

        listView.adapter = taskListAdapter

        listView.setOnItemClickListener { parent, view, position, id ->

            val text = "Clicked on item : " + (view as TextView).text.toString()


            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()

        }

    }
}