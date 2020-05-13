package com.example.kurybinis

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import kotlinx.android.synthetic.main.side_menu.*
import kotlinx.android.synthetic.main.side_menu_list.*

class SideMenuActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        val langua = arrayOf("gerti vandeni","valgyti")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.side_menu)

       val backBtn = findViewById<Button>(R.id.back)
        backBtn.setOnClickListener {
            finish()
        }

        val list = SideMenuList(this, langua)
        sidelist.adapter = list

        sidemenulist.setOnClickListener {
            startActivity(Intent(this, TaskActivity::class.java))
        }


    }


}