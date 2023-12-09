package com.example.dagger8dec

import android.util.Log

class SIMCard(private  val serviceProvider: ServiceProvider) {

//Field injection
//    public  lateinit var serviceProvider: ServiceProvider
    init {
        Log.i("MYTAG","SIM Card Constructed")
    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}