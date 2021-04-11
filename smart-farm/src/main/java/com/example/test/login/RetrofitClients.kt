package com.example.test.login

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitClients() {
    private val connectionTimeOutInSeconds = 15L
    private val readTimeOutInSeconds = 15L
    val generaClient by lazy<Retrofit> {
        val okHttpClient = OkHttpClient.Builder()
            .apply {
                connectTimeout(connectionTimeOutInSeconds, TimeUnit.SECONDS)
                readTimeout(readTimeOutInSeconds, TimeUnit.SECONDS)
//                certificatePinner()
//                addInterceptor()
//                if(isDebug()) {
//                    addInterceptor()
//                    addNetworkInterceptor()
//                }
            }
            .build()
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://www.wanandroid.com")
            .client(okHttpClient)
            .build()


    }

}