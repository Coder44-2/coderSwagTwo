package com.example.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.R
import com.example.coderswag.models.product

class ProductsRecycleAdapter(var context: Context, var products: List<product>) : RecyclerView.Adapter<ProductsRecycleAdapter.productVwHolder>(){
    open inner class productVwHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var productImg = itemView.findViewById<ImageView>(R.id.productImg)
        var productNameTxtFld = itemView.findViewById<TextView>(R.id.productNameTxtFld)
        var productPriceTxtFld = itemView.findViewById<TextView>(R.id.productPriceTxtFld)
        open fun productBind(context: Context, products: product){
            var resourceId = context.resources.getIdentifier(products.img, "drawable", context.packageName)
            productImg.setImageResource(resourceId)
            productNameTxtFld.text = products.title
            productPriceTxtFld.text = products.price
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): productVwHolder {
        var inflater = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return productVwHolder(inflater)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: productVwHolder, position: Int) {
        holder.productBind(context, products[position])
    }
}