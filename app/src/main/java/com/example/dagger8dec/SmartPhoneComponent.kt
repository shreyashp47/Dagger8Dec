package com.example.dagger8dec

import dagger.Component


//Module used to create object in dagger 2
@Component(modules = [MemoryCardModule::class])


//Component used to create object in dagger 2
//@Component
interface SmartPhoneComponent {
    fun getSmartPhone(): SmartPhone

}