package com.example.kurybinis

import android.app.Activity
import android.widget.ArrayAdapter
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class SideMenuList(private val context: Activity, private val task: Array<String>)
    : ArrayAdapter<String>(context, R.layout.side_menu, task) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.side_menu,null,true)

        val taskText = rowView.findViewById(R.id.sidemenulist) as Button

        taskText.text = task[position]
        return rowView
    }
}