package com.carpartssale

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.carpartssale.com.carpartssale.Item
import com.carpartssale.com.carpartssale.ItemAdapter

class Akkumulyatorlar : AppCompatActivity() {
    private lateinit var AkkumulyatorlarList:ArrayList<Item>
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akkumulyatorlar)

        supportActionBar?.title = "Akkumulyatorlar"

        val akkumulyatorlarRecyclerView = findViewById<RecyclerView>(R.id.akkumulyatorlarRV)

        AkkumulyatorlarList = ArrayList()

        AkkumulyatorlarList.add(Item(R.drawable.akkumulyator," INDIGO CMF86-520", 100,1))
        AkkumulyatorlarList.add(Item(R.drawable.akkumulyator,"VINCO 6CT-50 АПЗ", 100,1))
        AkkumulyatorlarList.add(Item(R.drawable.akkumulyator,"ATLAS MF85-550", 100,1))
        AkkumulyatorlarList.add(Item(R.drawable.akkumulyator," BARS 6CT-60", 100,1))
        AkkumulyatorlarList.add(Item(R.drawable.akkumulyator," EURO POWER CMF86", 100,1))
        AkkumulyatorlarList.add(Item(R.drawable.akkumulyator,"ROVER 6CT-60 ", 100,1))
        AkkumulyatorlarList.add(Item(R.drawable.akkumulyator,"SUPER DIAMOND MF44B19R", 100,1))
        AkkumulyatorlarList.add(Item(R.drawable.akkumulyator," WESTA RED 6CT-60", 100,1))
        AkkumulyatorlarList.add(Item(R.drawable.akkumulyator,"INDIGO CMF85-520 ", 100,1))
        AkkumulyatorlarList.add(Item(R.drawable.akkumulyator," INDIGO 40B19R ", 100,1))
        AkkumulyatorlarList.add(Item(R.drawable.akkumulyator," ATLAS MF85R-550", 100,1))
        AkkumulyatorlarList.add(Item(R.drawable.akkumulyator," VINCO 6CT-62 ", 100,1))
        AkkumulyatorlarList.add(Item(R.drawable.akkumulyator," WESTA RED 6CT-60", 100,1))
        AkkumulyatorlarList.add(Item(R.drawable.akkumulyator," ATLAS MF54459", 100,1))
        AkkumulyatorlarList.add(Item(R.drawable.akkumulyator," KAINAR 6CT-60", 100,1))
        AkkumulyatorlarList.add(Item(R.drawable.akkumulyator," ROVER 6CT-50", 100,1))
        AkkumulyatorlarList.add(Item(R.drawable.akkumulyator," ROVER 6CT-60", 100,1))
        AkkumulyatorlarList.add(Item(R.drawable.akkumulyator," BARS 6CT-62", 100,1))
        AkkumulyatorlarList.add(Item(R.drawable.akkumulyator," KAINAR 6CT-42 ", 100,1))
        AkkumulyatorlarList.add(Item(R.drawable.akkumulyator," ATLAS MF57412 ", 100,1))
        AkkumulyatorlarList.add(Item(R.drawable.akkumulyator," BARS 6CT-62 ", 100,1))
        AkkumulyatorlarList.add(Item(R.drawable.akkumulyator," INDIGO CMF50AL", 100,1))
        AkkumulyatorlarList.add(Item(R.drawable.akkumulyator," KAINAR 6CT", 100,1))

        akkumulyatorlarRecyclerView.adapter = ItemAdapter(AkkumulyatorlarList, this)
        akkumulyatorlarRecyclerView.layoutManager = LinearLayoutManager(this)
        akkumulyatorlarRecyclerView.setHasFixedSize(true)

    }
}