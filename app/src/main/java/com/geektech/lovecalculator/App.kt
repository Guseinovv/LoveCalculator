package com.geektech.lovecalculator

import android.app.Application
import com.geektech.lovecalculator.network.LoveApi

class App : Application() {
    companion object {
        lateinit var loveApi: LoveApi

    }

    override fun onCreate() {
        super.onCreate()
        val retrofitService = RetrofitService()
        loveApi = retrofitService.getApi()
    }
}