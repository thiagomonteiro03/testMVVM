package com.example.testmvvm.ui.main

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainRepository {

    val URL = "http://5f5a8f24d44d640016169133.mockapi.io/api/"

    fun getFilmes(callback: (filmes : List<Filme>) -> Unit) {
         Thread(Runnable {
            Thread.sleep(3000)
            callback.invoke(
                listOf(
                Filme(1,"Título 01"),
                Filme(1,"Título 02")
            ))
        }).start()
    }

    suspend fun getFilmesCoroutines(): List<Filme> {

        val api = Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        return withContext(Dispatchers.Default) {
            delay(3000)
            listOf(
                Filme(1,"Título 01"),
                Filme(1,"Título 02")
            )
        }

    }
}