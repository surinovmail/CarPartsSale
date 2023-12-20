package com.carpartssale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.carpartssale.com.carpartssale.Item
import com.carpartssale.com.carpartssale.ItemAdapter

class Avtokimyo : AppCompatActivity() {
    private lateinit var AvtokimyoList:ArrayList<Item>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shinalar)

        supportActionBar?.title = "Avtokimyo"
        val avtokimyoRV = findViewById<RecyclerView>(R.id.shinalarRV)

        AvtokimyoList = ArrayList()

        AvtokimyoList.add(Item(R.drawable.avtokimyo,"Стеклоомыватель зимний ", 1000,1))
        AvtokimyoList.add(Item(R.drawable.avtokimyo,"ASTROHIM 335 мл", 1000,1))
        AvtokimyoList.add(Item(R.drawable.avtokimyo,"ASTROHIM 210 мл", 1000,1))
        AvtokimyoList.add(Item(R.drawable.avtokimyo,"СRYSTAL CLEAN BLUE ", 1000,1))
        AvtokimyoList.add(Item(R.drawable.avtokimyo,"ASTROHIM 335 мл", 1000,1))
        AvtokimyoList.add(Item(R.drawable.avtokimyo,"ASTROHIM 22 кг", 1000,1))
        AvtokimyoList.add(Item(R.drawable.avtokimyo,"YSTAL CLEAN GREEN", 1000,1))
        AvtokimyoList.add(Item(R.drawable.avtokimyo,"UNIVERSAL ASTROHIM 20 кг", 1000,1))
        AvtokimyoList.add(Item(R.drawable.avtokimyo,"ASTROHIM 335 мл", 1000,1))
        AvtokimyoList.add(Item(R.drawable.avtokimyo,"ASTROHIM 5 л", 1000,1))
        AvtokimyoList.add(Item(R.drawable.avtokimyo,"СRYSTAL CLEAN GREEN", 1000,1))
        AvtokimyoList.add(Item(R.drawable.avtokimyo,"ASTROHIM 500 мл", 1000,1))
        AvtokimyoList.add(Item(R.drawable.avtokimyo,"Очиститель стекол зимний", 1000,1))
        AvtokimyoList.add(Item(R.drawable.avtokimyo,"Автошампунь для бесконтактной", 1000,1))
        AvtokimyoList.add(Item(R.drawable.avtokimyo,"Очиститель карбюратора", 1000,1))
        AvtokimyoList.add(Item(R.drawable.avtokimyo,"Воск жидкий готовый", 1000,1))
        AvtokimyoList.add(Item(R.drawable.avtokimyo,"ASTROHIM335 мл", 1000,1))
        AvtokimyoList.add(Item(R.drawable.avtokimyo,"ASTROHIM 520 мл", 1000,1))



        avtokimyoRV.adapter = ItemAdapter(AvtokimyoList, this)
        avtokimyoRV.layoutManager = LinearLayoutManager(this)
        avtokimyoRV.setHasFixedSize(true)
    }
}