package com.example.kurybinis

import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.app.Activity
import android.view.View
import android.view.ViewGroup

class ListAdapter(private val context: Activity, private val title: Array<String>)
    : ArrayAdapter<String>(context, R.layout.listview, title) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.listview, null, true)

        val titleText = rowView.findViewById(R.id.checkBox) as CheckBox

        titleText.text = title[position]
        return rowView


    }


}
