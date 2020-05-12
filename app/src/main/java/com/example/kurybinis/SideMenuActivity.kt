package com.example.kurybinis

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class SideMenuActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.side_menu)

       val backBtn = findViewById<Button>(R.id.back)
        backBtn.setOnClickListener {
            finish();
        }

    }
}