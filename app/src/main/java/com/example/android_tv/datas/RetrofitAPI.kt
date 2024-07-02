package com.example.android_tv.datas

import retrofit2.Call
import retrofit2.http.FieldMap
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST


interface APIService {

    @FormUrlEncoded
    fun sendData(@FieldMap params: HashMap<String, Any>): Call<RequestData>
}

