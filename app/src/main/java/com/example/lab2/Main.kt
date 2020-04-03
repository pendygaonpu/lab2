package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main3.*

class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        //transition to activity with data input and output function
        button1.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        //transition to activity with send email function
        button2.setOnClickListener {
            val intent=Intent(this,Main1::class.java)
            startActivity(intent)
        }
    }
}
