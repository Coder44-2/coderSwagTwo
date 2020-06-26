package com.example.coderswag.controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coderswag.R
import com.example.coderswag.utilities.EXTRA_PRODUCT

class ProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        var extraIntent = intent.getStringExtra(EXTRA_PRODUCT)
    }
}