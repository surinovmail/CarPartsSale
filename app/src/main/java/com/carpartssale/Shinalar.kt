package com.carpartssale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.carpartssale.com.carpartssale.Item
import com.carpartssale.com.carpartssale.ItemAdapter

class Shinalar : AppCompatActivity() {
    private lateinit var shinalarList:ArrayList<Item>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shinalar)

        supportActionBar?.title = "Shinalar"

        val shinalarRV = findViewById<RecyclerView>(R.id.shinalarRV)

        shinalarList = ArrayList()

        shinalarList.add(Item(R.drawable.shinalar,"95VXL", 1000,1))
        shinalarList.add(Item(R.drawable.shinalar,"93YXL PILOT SPORT", 1000,1))
        shinalarList.add(Item(R.drawable.shinalar,"105WXL", 1000,1))
        shinalarList.add(Item(R.drawable.shinalar,"93YXL PILOT SPORT", 1000,1))
        shinalarList.add(Item(R.drawable.shinalar,"100YXL PILOT SPORT", 1000,1))
        shinalarList.add(Item(R.drawable.shinalar,"96YXL PILOT SPORT", 1000,1))
        shinalarList.add(Item(R.drawable.shinalar,"107V PILOT SPORT 4", 1000,1))
        shinalarList.add(Item(R.drawable.shinalar,"100YXL PILOT", 1000,1))
        shinalarList.add(Item(R.drawable.shinalar,"102YXL PILOT", 1000,1))
        shinalarList.add(Item(R.drawable.shinalar,"113YXL PILOT", 1000,1))
        shinalarList.add(Item(R.drawable.shinalar,"106YXL PILOT", 1000,1))
        shinalarList.add(Item(R.drawable.shinalar,"116WXL PILOT SPORT", 1000,1))
        shinalarList.add(Item(R.drawable.shinalar,"111YXL PILOT SPORT", 1000,1))


        shinalarRV.adapter = ItemAdapter(shinalarList, this)
        shinalarRV.layoutManager = LinearLayoutManager(this)
        shinalarRV.setHasFixedSize(true)
    }
}