package com.example.kurybinis

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class SideMenuActivity: AppCompatActivity() {
    val language = arrayOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.side_menu)

       val backBtn = findViewById<Button>(R.id.back)
        backBtn.setOnClickListener {
            finish();
        }
        val listAdapter = ListAdapter(this,language)
        tasklist.adapter = listAdapter

    }
}