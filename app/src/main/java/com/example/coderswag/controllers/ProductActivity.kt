package com.example.coderswag.controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.R
import com.example.coderswag.adapters.ProductsRecycleAdapter
import com.example.coderswag.services.dataService
import com.example.coderswag.utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {
    lateinit var hatsRecycler: ProductsRecycleAdapter
    lateinit var shirtsRecycler: ProductsRecycleAdapter
    lateinit var hoodiesRecycler: ProductsRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        var extraIntent = intent.getStringExtra(EXTRA_PRODUCT)
        if (extraIntent == "SHIRTS"){
            shirtsRecycler = ProductsRecycleAdapter(this, dataService.shirts)
            productRecyclerView.adapter = shirtsRecycler
            var layoutManager = GridLayoutManager(this, 2, RecyclerView.VERTICAL, false)
            productRecyclerView.layoutManager = layoutManager
            productRecyclerView.setHasFixedSize(true)
        }
        if (extraIntent == "HATS"){
            hatsRecycler = ProductsRecycleAdapter(this, dataService.hats)
            productRecyclerView.adapter = hatsRecycler
            var layoutManager = GridLayoutManager(this, 2, RecyclerView.VERTICAL, false)
            productRecyclerView.layoutManager = layoutManager
            productRecyclerView.setHasFixedSize(true)
        }
        if (extraIntent == "HOODIES"){
            hoodiesRecycler = ProductsRecycleAdapter(this, dataService.hoodie)
            productRecyclerView.adapter = hoodiesRecycler
            var layoutManager = GridLayoutManager(this, 2, RecyclerView.VERTICAL, false)
            productRecyclerView.layoutManager = layoutManager
            productRecyclerView.setHasFixedSize(true)
        }
    }
}