package com.example.contacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
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



    }
}
class Adapter(
    val itemList : ArrayList<Person>,
    val inflater: LayoutInflater
) :RecyclerView.Adapter<Adapter.ViewHolder>( ){
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val name2 :TextView
        val phone_num2 : TextView
        init {
            name2 = itemView.findViewById()
        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ??? {

    }

    override fun getItemCount(): Int {

    }

    override fun onBindViewHolder(holder: ???, position: Int) {

    }


}





class Person(val name: String, val phone_num:String){

}
