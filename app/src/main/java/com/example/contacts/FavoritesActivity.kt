package com.example.contacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import kotlinx.android.synthetic.main.activity_favorites.*

class FavoritesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorites)


        All_Contacts_intent2.setOnClickListener{
            this.finish()


        }

    }
}

