package com.example.demoapp.demo

import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton

interface One {
    fun getName()
}

class ImplementOne @Inject constructor() : One {
    override fun getName() {
        Log.d("ImplementOne", "My Name is Amol")
    }

}

class Main @Inject constructor(private val one: One) {
    fun getName() {
        one.getName()
    }
}

@Module
@InstallIn(ActivityComponent::class)
abstract class AppModule {
    @Binds
    @ActivityScoped
    abstract fun binding(
            implementOne: ImplementOne
    ): One
}

/*
@Module
@InstallIn(ActivityComponent::class)
class AppModule{
    @Provides
    @ActivityScoped
    fun binding():One = ImplementOne()
}*/
