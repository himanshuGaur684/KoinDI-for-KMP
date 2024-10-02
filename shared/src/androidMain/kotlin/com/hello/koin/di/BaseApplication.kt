package com.hello.koin.di

import android.app.Application
import com.hello.koin.di.koin.getViewModelsModule
import com.hello.koin.di.koin.sharedModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@BaseApplication)

            modules(
                sharedModule+ getViewModelsModule()
            )

        }

    }

}