package com.example.colleaguescontact.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiDetails {

    const val BASE_URL = "https://61e947967bc0550017bc61bf.mockapi.io/"
    const val END_POINT_ONE = "api/v1/people"
    const val END_POINT_TWO = "api/v1/rooms"

    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var apiService = retrofit.create<ApiService>(ApiService::class.java)

}