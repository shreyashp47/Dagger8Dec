package com.example.dagger8dec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    //private lateinit var smartPhone: SmartPhone

    //using field injection
    //
    @Inject
    lateinit var smartPhone: SmartPhone
    @Inject
    lateinit var memoryCard: MemoryCard
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


///using field injection in dagger 2
//        DaggerSmartPhoneComponent.create()
//            .inject(this)
//            .makeACallWithRecording()



        //exp 1
        //using dagger 2
//        DaggerSmartPhoneComponent.create()
//            .getSmartPhone()
//            .makeACallWithRecording()


        //Without Dagger
//        val smartPhone = SmartPhone (
//        Battery(),
//        SIMCard(ServiceProvider()),
//        MemoryCard()).makeACallWithRecording()
    }


    //when we are using 3rd party libraries like retrofit or glide the class we dont own
    // we cant inject constructor in that type of calls
    // we create builder and all in retorfit
    // like we instanciate with context
    // for that we create modules and create provider functions to provide those dependicies
}