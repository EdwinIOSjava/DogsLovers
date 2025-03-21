package com.example.dogsloversapp.service

import com.example.dogsloversapp.data.BreedsList
import retrofit2.Call
import retrofit2.http.GET

interface ApiService{
    //https://dog.ceo/api/breeds/list/all
    @GET("breeds/list/all")
    suspend fun getBreeds(): BreedsList
}