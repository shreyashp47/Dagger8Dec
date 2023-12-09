package com.example.dagger8dec

import dagger.Module
import dagger.Provides


//module can have more than one provider functions
@Module
class MemoryCardModule {

    @Provides
    fun providesMemoryCard(): MemoryCard{
    return MemoryCard()
    }
}