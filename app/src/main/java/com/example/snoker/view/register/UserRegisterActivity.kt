package com.example.snoker.view.register

import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.snoker.R
import com.example.snoker.base.BaseActivity
import com.example.snoker.databinding.ActivityUserRegisterBinding
import kotlinx.android.synthetic.main.activity_user_register.*


class UserRegisterActivity : BaseActivity<ActivityUserRegisterBinding, UserRegisterViewModel>() {

    val buttonObserver = Observer<Boolean> {
        nextButton.isEnabled = it == true
    }
    val maleObserver = Observer<Boolean> {
        if(it == true) {
            maleButton.setSelected(true)
        }
        else {
            maleButton.setSelected(false)
        }
    }

    val femaleObserver = Observer<Boolean> {
        if(it == true) {
            femaleButton.setSelected(true)
        }
        else {
            femaleButton.setSelected(false)
        }
    }

    override val layoutResourceId: Int
        get() = R.layout.activity_user_register

    override val viewModel: UserRegisterViewModel = UserRegisterViewModel.getInstance()

    override fun initStartView() {
    }

    override fun initDataBinding() {
        val binding: ActivityUserRegisterBinding = DataBindingUtil.setContentView(this, layoutResourceId)
        binding.viewmodel = viewModel
        binding.viewmodel!!.isActiveButton.observe(this, buttonObserver)
        binding.viewmodel!!.isMaleSelected.observe(this, maleObserver)
        binding.viewmodel!!.isFemaleSelected.observe(this, femaleObserver)
    }

    override fun initAfterBinding() {
    }


}