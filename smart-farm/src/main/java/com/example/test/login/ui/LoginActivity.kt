package com.example.test.login.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.test.Mainpage.MainPageActivity
import com.example.test.R
import com.example.test.data.AccountBean
import com.example.test.databinding.ActivityLoginBinding
import kotlinx.android.synthetic.main.activity_login.*

/**
 * 使用ViewModel+DataBinding+Livedata来进行
 * ①利用DataBindingUtil来进行对View(XML)的绑定
 * ②利用binding.lifecycleOwner = this 来进行LiveData的绑定
 * ③利用binding.ViewModel = viewModel 来进行UI控制器Binding与ViewModel进行单向通信
 */
class LoginActivity : AppCompatActivity() {
    private val viewModel by lazy {
        ViewModelProviders.of(this).get(DataViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityLoginBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_login
        )
        binding.lifecycleOwner = this  // use Fragment.viewLifecycleOwner for fragments
        binding.viewModel = viewModel
        var accountBean = AccountBean ()
        //viewModel.accountBean.value = accountBean
        register_go.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "click", Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainPageActivity::class.java)
            startActivity(intent)
        })

    }
}