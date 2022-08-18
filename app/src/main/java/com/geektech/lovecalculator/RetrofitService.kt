package com.geektech.lovecalculator

import com.geektech.lovecalculator.network.LoveApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {
    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://love-calculator.p.rapidapi.com/")
        .addConverterFactory(GsonConverterFactory.create()).build()

    fun getApi(): LoveApi {
        return retrofit.create(LoveApi::class.java)
    }
}