package com.ajieno.bansostracking

import com.ajieno.tisol.service.Api
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
//    private const val BASE_URL = "http://10.70.3.208/silaga/"
    private const val BASE_URL = "https://pokkiproject.com/S+rqsLn90}1MfF2_herbiphp/"

    val instance: Api by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
//            .client(okHttpClient)
            .build()

        retrofit.create(Api::class.java)
    }
}