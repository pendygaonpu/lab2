package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

const val EMPID="empid"
const val EMPNAME="empname"
const val EMPSALARY="empsalary"
const val EMPPHONENUM="empphonenum"

class MainActivity : AppCompatActivity() {


    //input  function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submit_button.setOnClickListener{
            val intent=Intent(this,Main2::class.java)
                intent.putExtra(EMPID, emp_id.text.toString())
                intent.putExtra(EMPNAME, emp_name.text.toString())
                intent.putExtra(EMPSALARY, emp_salary.text.toString())
                intent.putExtra(EMPPHONENUM, emp_phone_num.text.toString())
                startActivity(intent)
        }
    }
}
