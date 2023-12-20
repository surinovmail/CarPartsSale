package com.carpartssale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.carpartssale.com.carpartssale.Item
import com.carpartssale.com.carpartssale.ItemAdapter

class Filtrlar : AppCompatActivity() {
    private lateinit var filtrlarList:ArrayList<Item>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filtrlar)

        supportActionBar?.title = "Filtrlar"

        val filtrlarRv = findViewById<RecyclerView>(R.id.filtrlarRV)

        filtrlarList = ArrayList()

        filtrlarList.add(Item(R.drawable.filtrlar, "Mercedes W202", 1000,1))
        filtrlarList.add(Item(R.drawable.filtrlar,"Mercedes W203", 1000,1))
        filtrlarList.add(Item(R.drawable.filtrlar,"АКПП ZF DAF XF95", 1000,1))
        filtrlarList.add(Item(R.drawable.filtrlar,"АКПП ZF MAN TGS", 1000,1))
        filtrlarList.add(Item(R.drawable.filtrlar,"ZF MB ACTROS MP2", 1000,1))
        filtrlarList.add(Item(R.drawable.filtrlar,"BOSCH Mercedes", 1000,1))
        filtrlarList.add(Item(R.drawable.filtrlar,"WIX BMW E70", 1000,1))
        filtrlarList.add(Item(R.drawable.filtrlar,"WIX DAF XF105 EURO", 1000,1))
        filtrlarList.add(Item(R.drawable.filtrlar,"WIX MAN CLA 28.280", 1000,1))
        filtrlarList.add(Item(R.drawable.filtrlar,"WIX Mercedes ACTROS", 1000,1))
        filtrlarList.add(Item(R.drawable.filtrlar,"VALESCO VF1012 ", 1000,1))
        filtrlarList.add(Item(R.drawable.filtrlar,"WIX Merceds SPRINTER", 1000,1))
        filtrlarList.add(Item(R.drawable.filtrlar,"WIX Mercedes ACTROS", 1000,1))
        filtrlarList.add(Item(R.drawable.filtrlar,"FEBI BILSTEIN", 1000,1))


        filtrlarRv.adapter = ItemAdapter(filtrlarList, this)
        filtrlarRv.layoutManager = LinearLayoutManager(this)
        filtrlarRv.setHasFixedSize(true)
    }
}