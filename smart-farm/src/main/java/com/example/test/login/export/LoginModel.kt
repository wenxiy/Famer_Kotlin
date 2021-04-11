package com.example.test.login.export

import com.example.test.data.AccountBean

class LoginModel(name: String, password: String) {
    var name : String = "null"
    var password : String = "null"
    fun login(): AccountBean {
        return AccountBean("wenxin", "193", "123456")
    }
}