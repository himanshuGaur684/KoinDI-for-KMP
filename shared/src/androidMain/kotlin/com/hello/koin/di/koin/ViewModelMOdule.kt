package com.hello.koin.di.koin

import com.hello.koin.di.viewmodels.FakeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun getViewModelsModule(): Module = module {
    viewModel { FakeViewModel(get()) }
}