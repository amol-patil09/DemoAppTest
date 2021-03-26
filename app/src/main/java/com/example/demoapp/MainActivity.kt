package com.example.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demoapp.demo.Car
import com.example.demoapp.demo.Engine
import com.example.demoapp.demo.Main
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car
    @Inject
    lateinit var main:Main
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        car.getCar()
        main.getName()
    }
}