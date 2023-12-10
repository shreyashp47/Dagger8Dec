package com.example.dagger8dec

import android.util.Log
import javax.inject.Inject


interface Battery {

//use constructor injection for dependency injection for evey possible scenario
//class Battery @Inject constructor(){
//    init {
//        Log.i("MYTAG","Battery Constructed")
//    }


    //interface method
    fun getPower()

//    fun getPower()
//    {
//        Log.i("MYTAG","Battery power is available")
//    }
}