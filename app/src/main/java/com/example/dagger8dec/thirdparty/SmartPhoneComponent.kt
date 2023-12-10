package com.example.dagger8dec.thirdparty

import com.example.dagger8dec.SmartPhone
import com.example.dagger8dec.usinginterface.BatteryModule
import dagger.Component


//Module used to create object in dagger 2
@Component(modules = [MemoryCardModule::class,BatteryModule::class])


//Component used to create object in dagger 2
//@Component
interface SmartPhoneComponent {
    fun getSmartPhone(): SmartPhone

}