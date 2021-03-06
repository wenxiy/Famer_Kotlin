package com.example.test.login.repo

import com.example.test.login.RetrofitClients
import retrofit2.http.GET
import java.lang.Exception

class RegisterRemoteRepo (private val retrofitClients: RetrofitClients){
    private val registerApi = retrofitClients.generaClient.create(RegisterApi::class.java)
    suspend fun getAccountBean():List<String>{
        return try {
           registerApi.getAccountBean()
        }
        catch (e:Exception){
            e.printStackTrace()
            listOf()
        }
    }

    internal interface RegisterApi{
        @GET()
        suspend fun getAccountBean():List<String>
    }
}