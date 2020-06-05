package com.example.productmanagment

import android.app.Application

class MyApplication : Application() {

    companion object {
        var globalVar = "My Application"
        val products = ArrayList<Product>()
    }

    override fun onCreate() {
        super.onCreate()
        // initialization code here
    }


}