package com.example.d4_kkotlin_viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

// The viewModel instance, along with SavedStateHandle, helps to preserve the progress state during configuration changes like screen rotation
class MainActivity : AppCompatActivity() {
    private lateinit var viewModel:MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        val tv = findViewById<TextView>(R.id.tvCount)
        val btn = findViewById<Button>(R.id.button)

//        tv.text = viewModel.count.toString()
        viewModel.count.observe(this, Observer {
            tv.text = it.toString()
        })

        btn.setOnClickListener{
            viewModel.updateCount()
//            tv.text = viewModel.count.toString()//get the count value in the view model
        }

    }
}