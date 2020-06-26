package com.example.coderswag.controllers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.R
import com.example.coderswag.adapters.categoryAdapter
import com.example.coderswag.adapters.categoryRecycleAdapter
import com.example.coderswag.models.category
import com.example.coderswag.services.dataService
import com.example.coderswag.utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var categoryAdapter: categoryRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        categoryAdapter = categoryRecycleAdapter(this, dataService.categories) {category ->
            val productAct = Intent(this, ProductActivity::class.java)
            productAct.putExtra(EXTRA_PRODUCT, category.title)
            startActivity(productAct)
        }
        categoryRecyclerView.adapter = categoryAdapter
        val layoutManager = LinearLayoutManager(this)
        categoryRecyclerView.layoutManager = layoutManager
        categoryRecyclerView.setHasFixedSize(true)
    }
}