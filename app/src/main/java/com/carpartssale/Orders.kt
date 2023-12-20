package com.carpartssale

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.carpartssale.com.carpartssale.Item
import com.carpartssale.com.carpartssale.ItemAdapter
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken

class Orders : Fragment() {

    companion object{
        var ordersList:ArrayList<Item> = ArrayList()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_orders, container, false)

        ordersList = ArrayList()

        try {
            val prefs = requireContext().getSharedPreferences("DATA", Context.MODE_PRIVATE)
            val jsonString = prefs.getString("ordersList",null)
            val typeToken = object: TypeToken<ArrayList<Item>>(){}.type
            if (jsonString != null){
                val jsonArray:ArrayList<Item> = GsonBuilder().create().fromJson(jsonString,typeToken)
                ordersList.clear()
                ordersList.addAll(jsonArray)

            }

        }
        catch (e:Exception){
            Toast.makeText(requireContext(),e.message.toString(),Toast.LENGTH_SHORT).show()
        }



        val ordersRV = view.findViewById<RecyclerView>(R.id.ordersRV)
        ordersRV.adapter = ProductAdapter(ordersList,requireContext())
        ordersRV.layoutManager = GridLayoutManager(requireContext(),2)
        ordersRV.setHasFixedSize(true)

        return view
    }

}