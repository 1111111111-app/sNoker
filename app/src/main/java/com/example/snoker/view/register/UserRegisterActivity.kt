package com.example.snoker.view.register

import android.content.Intent
import androidx.databinding.DataBindingUtil
import com.example.snoker.R
import com.example.snoker.base.BaseActivity
import com.example.snoker.databinding.ActivityUserRegisterBinding


class UserRegisterActivity : BaseActivity<ActivityUserRegisterBinding, UserRegisterViewModel>() {

    override val layoutResourceId: Int
        get() = R.layout.activity_user_register

    override val viewModel: UserRegisterViewModel = UserRegisterViewModel()

    override fun initStartView() {
    }

    override fun initDataBinding() {
        val binding: ActivityUserRegisterBinding = DataBindingUtil.setContentView(this, layoutResourceId)
        binding.viewmodel = viewModel

    }

    override fun initAfterBinding() {
    }


}