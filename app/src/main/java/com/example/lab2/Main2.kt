package com.example.lab2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2 : AppCompatActivity() {

    //output function
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        emp_id_value.setText("EMP ID: " + intent.getStringExtra(EMPID))
        emp_name_value.setText("EMP NAME: " + intent.getStringExtra(EMPNAME))
        emp_salary_value.setText("EMP SALARY: " + intent.getStringExtra(EMPSALARY))
        emp_phone_num_value.setText("EMP PHONE: " + intent.getStringExtra(EMPPHONENUM))

    }
}
