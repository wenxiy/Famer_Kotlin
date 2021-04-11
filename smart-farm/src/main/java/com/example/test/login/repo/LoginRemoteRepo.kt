package com.example.test.login.repo

import com.example.test.login.RetrofitClients
import retrofit2.http.GET
import java.lang.Exception


class LoginRemoteRepo (private val retrofitClients: RetrofitClients){
    private val loginApi = retrofitClients.generaClient.create(LoginApi::class.java)
    suspend fun getAccountBean():List<String>{
        return try {
            loginApi.LoginAccountBean()
        }
        catch (e: Exception){
            e.printStackTrace()
            listOf()
        }
    }

    internal interface LoginApi{
        @GET("/user/login")
        suspend fun LoginAccountBean():List<String>
    }
}