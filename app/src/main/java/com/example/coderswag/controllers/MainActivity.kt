package com.example.coderswag.controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.coderswag.R
import com.example.coderswag.adapters.categoryAdapter
import com.example.coderswag.models.category
import com.example.coderswag.services.dataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var categoryAdapter: categoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        categoryAdapter = categoryAdapter(this, dataService.categories)
        categoryListView.adapter = categoryAdapter
    }
}