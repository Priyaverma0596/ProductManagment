package com.example.productmanagment

import android.graphics.Color
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.productmanagment.MyApplication.Companion.products

class ViewProducts : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_products)
        val actionBar = supportActionBar
        actionBar!!.title = "List of Products"
        var mApp = MyApplication()
        var products = products
        var listView = findViewById<ListView>(R.id.listproduct)




        val myListAdapter = MyListAdapter(this,products)
        listView.adapter = myListAdapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, id ->
            adapterView.getChildAt(position).setBackgroundColor(Color.rgb(53, 177, 212));

            val selectedItem = adapterView.getItemAtPosition(position)
            Toast.makeText(applicationContext,"click item $selectedItem",Toast.LENGTH_SHORT).show()
        }
    }
}

