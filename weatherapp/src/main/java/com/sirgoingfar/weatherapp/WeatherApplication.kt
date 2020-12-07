package com.sirgoingfar.weatherapp

import android.app.Application
import com.sirgoingfar.weatherapp.di.AppInjector

class WeatherApplication:Application() {

    override fun onCreate() {
        super.onCreate()

        initializeDagger()
    }

    private fun initializeDagger(){
        AppInjector.initialize(this)
    }

}