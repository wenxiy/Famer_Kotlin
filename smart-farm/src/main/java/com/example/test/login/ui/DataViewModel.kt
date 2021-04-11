package com.example.test.login.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.test.data.AccountBean
import com.example.test.login.export.LoginModel

/**
 *
 */
class DataViewModel : ViewModel() {
    var loginModel = LoginModel("wenxin", "xixi")
    var accountBean = MutableLiveData<AccountBean>()

    fun getAccountBean() {
//       viewModelScope.launch {
//            try {
//               val accountdata = withContext(Dispatchers.IO) {
//
//                }
//           }
    }
}