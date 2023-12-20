package com.carpartssale

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.carpartssale.com.carpartssale.Item
import com.google.android.material.imageview.ShapeableImageView
import com.google.gson.GsonBuilder

class ProductAdapter(private var ordersList:ArrayList<Item>,private val context: Context) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>(){

    class ProductViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){

        val orderedProductImage = itemView.findViewById<ShapeableImageView>(R.id.orderedProductIV)
        val orderedProductName = itemView.findViewById<TextView>(R.id.productNameTV)
        val cancelBtn = itemView.findViewById<ViewGroup>(R.id.cancelBtn)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.product_item,parent,false)
        return ProductViewHolder(itemView)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {

        val currentProduct = ordersList[position]
        holder.orderedProductName.text = currentProduct.name

        holder.cancelBtn.setOnClickListener {
            Orders.ordersList.removeAt(position)
            val prefs = context.getSharedPreferences("DATA", Context.MODE_PRIVATE).edit()
            val jsonString = GsonBuilder().create().toJson(Orders.ordersList)
            prefs.putString("ordersList",jsonString)
            prefs.apply()
            notifyDataSetChanged()
        }

    }

    override fun getItemCount() = ordersList.size

}