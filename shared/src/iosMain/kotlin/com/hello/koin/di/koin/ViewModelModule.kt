package com.hello.koin.di.koin

import com.hello.koin.di.viewmodels.FakeViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.module.Module
import org.koin.dsl.module

private val viewModelModules = module {
    single { FakeViewModel(get()) }
}

actual fun getViewModelsModule(): Module = viewModelModules


object ProvideViewModel : KoinComponent{

    fun getFakeViewModel() : FakeViewModel = get()

}
