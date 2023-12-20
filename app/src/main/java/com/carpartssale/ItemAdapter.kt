package com.carpartssale.com.carpartssale

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import com.carpartssale.Orders
import com.carpartssale.R
import com.google.gson.GsonBuilder
import de.hdodenhof.circleimageview.CircleImageView

class ItemAdapter(private var itemsList:ArrayList<Item>,private val context:Context) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    class ItemViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){

        val productImage = itemView.findViewById<CircleImageView>(R.id.productImage)
        val productName = itemView.findViewById<TextView>(R.id.productName)
        val productPrice = itemView.findViewById<TextView>(R.id.productPrice)
        val orderProduct = itemView.findViewById<ImageView>(R.id.orderProduct)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ItemViewHolder(itemView)
    }

    override fun getItemCount() = itemsList.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val currentItem = itemsList[position]
        holder.productName.text =currentItem.name
        holder.productPrice.text=currentItem.price.toString()

        Glide.with(holder.itemView.context)
            .load(currentItem.image)
            .apply(
                RequestOptions()
                    .placeholder(R.drawable.applogo)
                    .error(R.drawable.applogo)
                    .centerCrop()
            )
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(holder.productImage)

        holder.orderProduct.setOnClickListener {
            Orders.ordersList.add(currentItem)
            val prefs = context.getSharedPreferences("DATA",Context.MODE_PRIVATE).edit()
            val jsonString = GsonBuilder().create().toJson(Orders.ordersList)
            prefs.putString("ordersList",jsonString)
            prefs.apply()
            Toast.makeText(context,"Mahsulot savatga qo'shildi",Toast.LENGTH_SHORT).show()

        }

    }

}