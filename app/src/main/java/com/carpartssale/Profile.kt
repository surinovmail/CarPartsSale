package com.carpartssale

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class Profile : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val signin = view.findViewById<Button>(R.id.signin)
        val signup = view.findViewById<Button>(R.id.signup)

        signin.setOnClickListener{
            val url = "https://accounts.google.com/servicelogin?hl=en-gb"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        signup.setOnClickListener {
            val url = "https://www.google.com/account/about/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        return view
    }

}