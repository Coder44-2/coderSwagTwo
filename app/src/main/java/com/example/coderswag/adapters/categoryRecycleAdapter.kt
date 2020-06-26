package com.example.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.R
import com.example.coderswag.models.category
import kotlinx.android.synthetic.main.category_list_item.view.*

class categoryRecycleAdapter(var context : Context, var categories: List<category>, var itemClick: (category) -> Unit) : RecyclerView.Adapter<categoryRecycleAdapter.holder>() {
    inner class holder(itemView: View, var itemClick: (category) -> Unit) : RecyclerView.ViewHolder(itemView) {
        var categoryImg = itemView.findViewById<ImageView>(R.id.categoryImg)
        var categoryTxt = itemView.findViewById<TextView>(R.id.categoryName)
        fun bindCategory(categoryClassInherit: category, context: Context){
            val resourceid = context.resources.getIdentifier(categoryClassInherit.img, "drawable", context.packageName)
            categoryImg.setImageResource(resourceid)
            categoryTxt.text = categoryClassInherit.title
            itemView.setOnClickListener { itemClick(categoryClassInherit) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): holder {
        var categoryView = LayoutInflater.from(parent.context).inflate(R.layout.category_list_item, parent, false)
        return holder(categoryView, itemClick)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: holder, position: Int) {
        holder.bindCategory(categories[position], context)
    }
}