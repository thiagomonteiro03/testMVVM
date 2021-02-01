package com.example.testmvvm.ui.main

import retrofit2.Call
import retrofit2.http.GET

interface MyAPI {

    @GET("events")
    fun getEvents() : Call<List<Filme>>

}