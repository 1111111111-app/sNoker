package com.example.snoker.view.register

import android.content.Context
import android.content.Intent
import android.view.View
import com.example.snoker.base.BaseViewModel
import com.example.snoker.view.smokeinfo.SmokeInfoActivity

class UserRegisterViewModel : BaseViewModel() {
    private val TAG = "UserRegisterActivity"

    fun moveNextActivity(view: View) {
        val context: Context = view.context
        val intent = Intent(context, SmokeInfoActivity::class.java)
        context.startActivity(intent)
    }
}