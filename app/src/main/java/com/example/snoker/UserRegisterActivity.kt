package com.example.snoker

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_intro.*
import kotlinx.android.synthetic.main.activity_user_register.*

class UserRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_register)


        nextButton.setOnClickListener { view ->
            val intent = Intent(applicationContext, SmokeInfoActivity::class.java)
            startActivity(intent)
        }

        maleButton.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View?) {
               view!!.setSelected(!view.isSelected())

                if(view.isSelected())
                    if(femaleButton.isSelected())
                        femaleButton.callOnClick()
            }
        })

        femaleButton.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View?) {
                view!!.setSelected(!view.isSelected())

                if(view.isSelected())
                    if(maleButton.isSelected())
                        maleButton.callOnClick()
            }
        })
//
//
    }

}