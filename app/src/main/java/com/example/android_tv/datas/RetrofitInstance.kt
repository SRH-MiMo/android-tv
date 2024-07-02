package com.example.android_tv.datas


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {


    var api: APIService =
        Retrofit.Builder()
            .baseUrl("https://io.adafruit.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(APIService::class.java)

}
