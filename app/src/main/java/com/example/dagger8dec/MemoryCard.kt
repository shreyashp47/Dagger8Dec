package com.example.dagger8dec

import android.util.Log
import javax.inject.Inject


//let suppose we have 3rd party library so we dont own this class and we cant inject constructor
class MemoryCard {


    //class MemoryCard @Inject constructor(){
    init {
        Log.i("MYTAG","Memory Card Constructed")
    }

    fun getSpaceAvailablity(){
        Log.i("MYTAG","Memory space available")
    }
}