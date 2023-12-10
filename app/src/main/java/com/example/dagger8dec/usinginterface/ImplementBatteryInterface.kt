package com.example.dagger8dec.usinginterface

import android.util.Log
import com.example.dagger8dec.Battery
import javax.inject.Inject

class ImplementBatteryInterface @Inject constructor() : Battery {

    override fun getPower() {
        Log.i("MYTAG","Battery power from interface ")
    }

}