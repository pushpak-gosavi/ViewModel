package com.vm.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),LifecycleOwner {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModelMainActivity= ViewModelProvider(this).get(ViewModelMainActivity::class.java)
        tvNumber.text= viewModelMainActivity.number.toString()
        btnAdd.setOnClickListener {
            viewModelMainActivity.addNumber()
            tvNumber.text= viewModelMainActivity.number.toString()
        }
    }
}