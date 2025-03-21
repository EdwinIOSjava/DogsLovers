package com.example.dogsloversapp.service

import com.example.dogsloversapp.data.BreedImages
import com.example.dogsloversapp.data.BreedRandomImage
import com.example.dogsloversapp.data.BreedsList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService{
    //https://dog.ceo/api/breeds/list/all
    @GET("breeds/list/all")
    suspend fun getBreeds(): BreedsList

    @GET("breed/{breed}/images")
    suspend fun getBreedImages(@Path("breed") breed: String): BreedImages

    @GET("breed/{breed}/images/random")
    suspend fun getBreedRandomImage(@Path("breed") breed: String): BreedRandomImage
}