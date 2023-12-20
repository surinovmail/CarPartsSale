package com.carpartssale

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment

class Products : Fragment() {


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_products, container, false)

        val shinalar = view.findViewById<ImageButton>(R.id.shinalar)
        val avtokimyo = view.findViewById<ImageButton>(R.id.avtokimyo)
        val akkumulyatorlar = view.findViewById<ImageButton>(R.id.akkumulyator)
        val motormoylari = view.findViewById<ImageButton>(R.id.motormoyi)
        val asboblar = view.findViewById<ImageButton>(R.id.asboblar)
        val filtrlar = view.findViewById<ImageButton>(R.id.filtrlar)

        shinalar.setOnClickListener {
            startActivity(Intent(requireContext(),Shinalar::class.java))
        }
        avtokimyo.setOnClickListener {
            startActivity(Intent(requireContext(),Avtokimyo::class.java))
        }
        akkumulyatorlar.setOnClickListener {
            startActivity(Intent(requireContext(),Akkumulyatorlar::class.java))
        }
        motormoylari.setOnClickListener {
            startActivity(Intent(requireContext(),Motormoylari::class.java))
        }
        asboblar.setOnClickListener {
            startActivity(Intent(requireContext(),Asboblar::class.java))
        }
        filtrlar.setOnClickListener {
            startActivity(Intent(requireContext(),Filtrlar::class.java))
        }

        return  view
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentTransaction = childFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
    }



}