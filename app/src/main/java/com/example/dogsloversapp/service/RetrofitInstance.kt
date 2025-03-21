package com.example.dogsloversapp.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val BASE_URL="https://dog.ceo/api/"

    val api: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())// convierte JSON a objetos en Kotlin
            .build()
            .create(ApiService::class.java)

    }
}