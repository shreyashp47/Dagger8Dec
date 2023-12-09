package com.example.dagger8dec

import android.util.Log
import javax.inject.Inject


//constructor injection
//making constructor visible to dagger and injecting it
//use constructor injection for dependency injection for evey possible scenario
class SmartPhone @Inject constructor(val battery: Battery, val simCard: SIMCard, val memoryCard: MemoryCard) {

    //with out dagger 2
//class SmartPhone(val battery: Battery, val simCard: SIMCard, val memoryCard: MemoryCard) {

    init {
        Log.i("MYTAG", "SmartPhone Constructed")
        battery.getPower()
        simCard.getConnection()
        memoryCard.getSpaceAvailablity()
    }

    fun makeACallWithRecording() {
        Log.i("MYTAG", "Calling.....")
    }
}