package com.example.contacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_favorites.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.person.*
import org.w3c.dom.Text
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Favorites_intent.setOnClickListener{

            val intent = Intent(this, FavoritesActivity::class.java)
            startActivity(intent)

        }   //intent

        val personlist = ArrayList<Person>() //Add View 리스트

        for ( i in 0 until 10) {

            personlist.add(Person("이름","010-0000-0000"))


        }//personlist에 넣는거

        val container = findViewById<LinearLayout>(R.id.addview_container)
        // container이라는 변수에 activity_main에 종속된 LinearLayout에 있는 addview_container을 넣는다.
        val inflater = LayoutInflater.from(this)
        // inflater = View를 그려준다. 이 곳의 Layout의 View를 그려준다.

        for (i in 0 until personlist.size){
            val itemview = inflater.inflate(R.layout.person,null)
           val personName =  itemview.findViewById<TextView>(R.id.person_name)
            val phoneNum = itemview.findViewById<TextView>(R.id.dinalNum)



            personName.setText(personlist.get(i).name)
            phoneNum.setText(personlist.get(i).phone_num)
            container.addView(itemview)



        }






    }
}

class Person(val name: String, val phone_num:String){

}
