package com.example.productmanagment

import com.example.productmanagment.MyApplication.Companion.globalVar
import com.example.productmanagment.MyApplication.Companion.products

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {


        var strGlobalVar = globalVar

        products.add(Product("water",30,4))
        products.add(Product("rice",54,3))
        products.add(Product("wheat",44,2))
        products.add(Product("beans",60,10))
        products.add(Product("refined oil",100,30))
        products.add(Product("Cumin powder",22,0))

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        val viewbutton = findViewById<Button>(R.id.viewproduct)
        viewbutton.setOnClickListener{
            val intent = Intent(this, ViewProducts::class.java)
            startActivity(intent)
        }
        val addbutton = findViewById<Button>(R.id.addproduct)
        addbutton.setOnClickListener{
            val intent = Intent(this, AddProduct::class.java)
            startActivity(intent)
        }

    }
}



