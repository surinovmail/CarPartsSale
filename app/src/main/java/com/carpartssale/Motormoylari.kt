package com.carpartssale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.carpartssale.com.carpartssale.Item
import com.carpartssale.com.carpartssale.ItemAdapter

class Motormoylari : AppCompatActivity() {
    private lateinit var motormoylariList:ArrayList<Item>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motormoylari)

        supportActionBar?.title = "MotorMoylari"

        val motormoylariRV = findViewById<RecyclerView>(R.id.motormoylariRV)

        motormoylariList = ArrayList()

        motormoylariList.add(Item(R.drawable.motormoylari,"S-oil DRAGON", 1000,1))
        motormoylariList.add(Item(R.drawable.motormoylari,"15W-40 API SG/CD", 1000,1))
        motormoylariList.add(Item(R.drawable.motormoylari,"ARDECA MATIC ", 1000,1))
        motormoylariList.add(Item(R.drawable.motormoylari,"ARDECA MATIC+III", 1000,1))
        motormoylariList.add(Item(R.drawable.motormoylari,"ATLANT EXPERT HLP46 20л", 1000,1))
        motormoylariList.add(Item(R.drawable.motormoylari,"PETRONAS PLI HYDRAULIC 68", 1000,1))
        motormoylariList.add(Item(R.drawable.motormoylari,"ROLF HLP 32 20л ", 1000,1))
        motormoylariList.add(Item(R.drawable.motormoylari,"ROLF HLP 46 20л", 1000,1))
        motormoylariList.add(Item(R.drawable.motormoylari,"ROLF HLP 68 20л", 1000,1))
        motormoylariList.add(Item(R.drawable.motormoylari,"S-oil 32. 20л", 1000,1))
        motormoylariList.add(Item(R.drawable.motormoylari,"S-oil 46H-EX 20л", 1000,1))
        motormoylariList.add(Item(R.drawable.motormoylari,"SHELL TELLUS S2 MX 32 20л", 1000,1))
        motormoylariList.add(Item(R.drawable.motormoylari,"SHELL TELLUS S2 MX 46 209л", 1000,1))
        motormoylariList.add(Item(R.drawable.motormoylari,"SHELL TELLUS S2 MX 46 20л", 1000,1))
        motormoylariList.add(Item(R.drawable.motormoylari,"SHELL TELLUS S2 MX 68 20л", 1000,1))
        motormoylariList.add(Item(R.drawable.motormoylari,"SINTEC HLP 46 20л", 1000,1))
        motormoylariList.add(Item(R.drawable.motormoylari,"SINTEC ВМГ3 10л", 1000,1))
        motormoylariList.add(Item(R.drawable.motormoylari,"SINTEC МГЕ-46В 10л", 1000,1))
        motormoylariList.add(Item(R.drawable.motormoylari,"HYDRO HLP 46 20л", 1000,1))
        motormoylariList.add(Item(R.drawable.motormoylari,"TAKAYAMA HV 46 20л", 1000,1))
        motormoylariList.add(Item(R.drawable.motormoylari,"ARDECA PRO-TEC TDX", 1000,1))
        motormoylariList.add(Item(R.drawable.motormoylari,"ARDECA PRO-TEC TDX", 1000,1))
        motormoylariList.add(Item(R.drawable.motormoylari,"PETRONAS URANIA 3000", 1000,1))


        motormoylariRV.adapter = ItemAdapter(motormoylariList, this)
        motormoylariRV.layoutManager = LinearLayoutManager(this)
        motormoylariRV.setHasFixedSize(true)
    }
}