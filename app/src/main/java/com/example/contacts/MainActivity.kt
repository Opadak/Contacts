package com.example.contacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_favorites.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Favorites_intent.setOnClickListener{

            val intent = Intent(this, FavoritesActivity::class.java)
            startActivity(intent)

        }   //intent

        val personlist = ArrayList<String>() //Add View 리스트


        val addview_container = findViewById<LinearLayout>(R.id.person_name)
        val inflater = LayoutInflater.from(this)


    }
}