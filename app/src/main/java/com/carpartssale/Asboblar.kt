package com.carpartssale

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.carpartssale.com.carpartssale.Item
import com.carpartssale.com.carpartssale.ItemAdapter

class Asboblar : AppCompatActivity() {
    private lateinit var AsboblarList:ArrayList<Item>
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asboblar)

        supportActionBar?.title = "Asboblar"

        val asboblarRV = findViewById<RecyclerView>(R.id.asboblarRV)

        AsboblarList = ArrayList()

        AsboblarList.add(Item(R.drawable.asboblar,"Автокомпрессор 12V", 1000,1))
        AsboblarList.add(Item(R.drawable.asboblar,"Ареометр для электролита", 1000,1))
        AsboblarList.add(Item(R.drawable.asboblar,"Бокорезы 125 мм", 1000,1))
        AsboblarList.add(Item(R.drawable.asboblar,"Вороток 1/2 L=300mm ", 1000,1))
        AsboblarList.add(Item(R.drawable.asboblar,"Вороток 250 мм ", 1000,1))
        AsboblarList.add(Item(R.drawable.asboblar,"Головка торцевая", 1000,1))
        AsboblarList.add(Item(R.drawable.asboblar,"AVTODELO 39165", 1000,1))
        AsboblarList.add(Item(R.drawable.asboblar,"AVTODELO 39166", 1000,1))
        AsboblarList.add(Item(R.drawable.asboblar,"AVTODELO 39167", 1000,1))
        AsboblarList.add(Item(R.drawable.asboblar,"AVTODELO 39168", 1000,1))
        AsboblarList.add(Item(R.drawable.asboblar,"AVTODELO 39169", 1000,1))
        AsboblarList.add(Item(R.drawable.asboblar,"AVTODELO 39170", 1000,1))
        AsboblarList.add(Item(R.drawable.asboblar,"AVTODELO 39171", 1000,1))
        AsboblarList.add(Item(R.drawable.asboblar,"Головка торцевая ", 1000,1))
        AsboblarList.add(Item(R.drawable.asboblar,"Домкрат гидр", 1000,1))

        asboblarRV.adapter = ItemAdapter(AsboblarList, this)
        asboblarRV.layoutManager = LinearLayoutManager(this)
        asboblarRV.setHasFixedSize(true)
    }
}