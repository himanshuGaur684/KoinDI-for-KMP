package com.hello.koin.di.viewmodels

import androidx.lifecycle.ViewModel
import com.hello.koin.di.use_cases.FakeUseCase

class FakeViewModel(private val fakeUseCase: FakeUseCase) : ViewModel() {


    fun fetchMessage() = fakeUseCase.invoke()

}