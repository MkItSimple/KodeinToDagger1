package com.example.kodeintodagger1

import android.app.Application
import com.example.kodeintodagger1.di.AppComponent
import com.example.kodeintodagger1.di.DaggerAppComponent

class BaseApplication : Application(){

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        this.appComponent = this.initDagger()
    }

    private fun initDagger()  = DaggerAppComponent.builder()
        .build()
}