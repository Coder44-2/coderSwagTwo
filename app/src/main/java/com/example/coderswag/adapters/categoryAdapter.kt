package com.example.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.R
import com.example.coderswag.models.category

class categoryAdapter(context: Context, categories: List<category>) : BaseAdapter() {
    var context = context
    var categories = categories
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder: viewHolder
        if (convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = viewHolder()
            holder.categoryImg = categoryView.findViewById(R.id.categoryImg)
            holder.categoryTxt = categoryView.findViewById(R.id.categoryName)
            categoryView.tag = holder
        }
        else{
            holder = convertView.tag as viewHolder
            categoryView = convertView
        }
        val category = categories[position]
        val resourceid = context.resources.getIdentifier(category.img, "drawable", context.packageName)

        holder.categoryTxt!!.text  = category.title
        holder.categoryImg!!.setImageResource(resourceid)

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }
    private class viewHolder{
        var categoryImg : ImageView? = null
        var categoryTxt: TextView? = null
    }
}