package com.hello.koin.di

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform