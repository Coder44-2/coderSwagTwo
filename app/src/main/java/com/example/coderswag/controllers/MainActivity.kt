package com.example.coderswag.controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.coderswag.R
import com.example.coderswag.models.category
import com.example.coderswag.services.dataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var categoryAdapter: ArrayAdapter<category>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        categoryAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            dataService.categories
            )
        categoryListView.adapter = categoryAdapter
    }
}