package com.example.demoapp.demo

import android.util.Log
import javax.inject.Inject

class Wheel {
    @Inject
    constructor()
    fun getWheel(){
        Log.d("Wheel", "Wheel is started...")
    }
}