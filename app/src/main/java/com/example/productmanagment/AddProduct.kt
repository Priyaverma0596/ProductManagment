package com.example.productmanagment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import com.example.productmanagment.MyApplication.Companion.products
import kotlinx.android.synthetic.main.activity_add_product.*

class AddProduct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_product)
        val viewbutton = findViewById<Button>(R.id.add)

        viewbutton.setOnClickListener{
            var name = productname.text.toString()
            var price = price.text.toString().toInt()
            var quantity = quantity.text.toString().toInt()
            products.add(Product(name,price,quantity))
            val intent = Intent(this, ViewProducts::class.java)
            startActivity(intent)
        }
      }
}
