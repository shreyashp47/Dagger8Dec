package com.example.dagger8dec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val smartPhone = SmartPhone (
        Battery(),
        SIMCard(ServiceProvider()),
        MemoryCard())

        smartPhone.makeACallWithRecording()
    }
}