package com.example.dagger8dec.usinginterface

import com.example.dagger8dec.Battery
import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
abstract class BatteryModule  {

    @Binds
    abstract fun bindsBattery(implementBatteryInterface: ImplementBatteryInterface): Battery
}


//@Module
//class BatteryModule  {
//
//    @Provides
//    fun providesBattery(implementBatteryInterface: ImplementBatteryInterface): Battery {
//        return implementBatteryInterface
//    }
//}