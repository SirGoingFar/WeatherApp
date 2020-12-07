package com.sirgoingfar.core.di

import android.app.Application
import android.content.Context
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        CoreModule::class
    ]
)
@Singleton
interface CoreComponent {

    fun getContext(): Context

    fun getApplication(): Application

}