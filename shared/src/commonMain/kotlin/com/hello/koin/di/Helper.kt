package com.hello.koin.di

import com.hello.koin.di.koin.getViewModelsModule
import com.hello.koin.di.koin.sharedModule
import org.koin.core.context.startKoin

fun initKoin() {
    startKoin {
        modules(sharedModule+ getViewModelsModule())
    }
}