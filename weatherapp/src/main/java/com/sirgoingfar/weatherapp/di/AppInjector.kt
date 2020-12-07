package com.sirgoingfar.weatherapp.di

import android.app.Application
import com.sirgoingfar.core.di.CoreInjector

object AppInjector {

    fun initialize(application: Application){
        initializeCore(application)
    }

    private fun initializeCore(application: Application){
        CoreInjector.initialize(application)
    }

}