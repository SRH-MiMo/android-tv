package com.example.android_tv.datas

import com.google.gson.annotations.SerializedName

data class RequestData(
    val value: String
)

data class Post(
    @SerializedName("value") val value: String
)