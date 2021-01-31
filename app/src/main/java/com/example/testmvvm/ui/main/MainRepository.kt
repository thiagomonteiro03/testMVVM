package com.example.testmvvm.ui.main

class MainRepository {

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

    fun getFilmesCoroutines(): List<Filme> {

    }
}