package com.example.snoker.view.intro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.snoker.R
import com.example.snoker.view.main.MainActivity
import com.example.snoker.view.register.UserRegisterActivity
import kotlinx.android.synthetic.main.activity_intro.*
//test

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        nextButton.setOnClickListener { view ->
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }

}