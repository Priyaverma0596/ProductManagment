package com.example.productmanagment


import android.app.Activity
import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.*

class MyListAdapter(private val context: Activity, private val product: ArrayList<Product>)
    : ArrayAdapter<Product>(context, R.layout.listview, product) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {


        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.listview, null, true)


        val titleText = rowView.findViewById(R.id.name) as TextView
        val subtitleText = rowView.findViewById(R.id.price) as TextView
        val quantityText = rowView.findViewById(R.id.quantity) as TextView


        titleText.text = product.get(position).name
        println(product.get(position).name)
        subtitleText.text = product.get(position).price.toString()
        quantityText.text = product.get(position).quantity.toString()
        return rowView
    }
}