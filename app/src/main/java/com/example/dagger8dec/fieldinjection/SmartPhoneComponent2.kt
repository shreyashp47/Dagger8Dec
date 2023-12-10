package com.example.dagger8dec.fieldinjection

import com.example.dagger8dec.MainActivity
import com.example.dagger8dec.SmartPhone
import com.example.dagger8dec.thirdparty.MemoryCardModule
import com.example.dagger8dec.usinginterface.BatteryModule
import dagger.Component


@Component(modules = [MemoryCardModule::class,BatteryModule::class])

interface SmartPhoneComponent2 {
fun inject(mainActivity: MainActivity)

}