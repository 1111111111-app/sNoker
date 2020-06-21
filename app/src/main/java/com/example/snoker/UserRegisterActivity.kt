package com.example.snoker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_user_register.*

class UserRegisterActivity : AppCompatActivity() {

    private val isCompleteRegister : Boolean = false

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

                callOnClick(view, femaleButton)
            }
        })

        femaleButton.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View?) {
                view!!.setSelected(!view.isSelected())

                callOnClick(view, maleButton)
            }
        })

    }

    private fun callOnClick(view: View?, button: Button?) {
        if(view!!.isSelected())
            if(button!!.isSelected())
                button.callOnClick()
    }

}