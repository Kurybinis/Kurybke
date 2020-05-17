package com.example.kurybinis

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar.*

class MainActivity : AppCompatActivity() {
    val language = arrayOf("gerti vandeni","valgyti")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        open.setOnClickListener {
            startActivity(Intent(this, SideMenuActivity::class.java))
        }

        val ListAdapter = ListAdapter(this,language)
        tasklist.adapter = ListAdapter



        }



    }







