package com.hello.koin.di.koin

import com.hello.koin.di.use_cases.FakeUseCase
import org.koin.dsl.module

val sharedModule = module {

    factory { FakeUseCase() }
}