package com.example.snoker.view.register

import android.app.DatePickerDialog
import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.DatePicker
import com.example.snoker.base.BaseViewModel
import com.example.snoker.view.smokeinfo.SmokeInfoActivity
import java.util.*

class UserRegisterViewModel : BaseViewModel() {
    private val TAG = "UserRegisterActivity"
    private var birthdayCalendar = Calendar.getInstance()
    private var startSmokeCalendar = Calendar.getInstance()

    private var birthDayPickerListener = object: DatePickerDialog.OnDateSetListener{
        override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
            birthdayCalendar!!.set(Calendar.YEAR, year)
            birthdayCalendar!!.set(Calendar.MONTH, month)
            birthdayCalendar!!.set(Calendar.DAY_OF_MONTH, dayOfMonth)
        }
    }

    private var startSmokePickerListener = object: DatePickerDialog.OnDateSetListener{
        override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
            startSmokeCalendar!!.set(Calendar.YEAR, year)
            startSmokeCalendar!!.set(Calendar.MONTH, month)
            startSmokeCalendar!!.set(Calendar.DAY_OF_MONTH, dayOfMonth)
        }
    }

    fun moveNextActivity(view: View) {
        val context: Context = view.context
        val intent = Intent(context, SmokeInfoActivity::class.java)
        context.startActivity(intent)
    }

    fun birthDayDialog(view: View) {
        val context: Context = view.context
        var datePickerDialog = DatePickerDialog(context, birthDayPickerListener, birthdayCalendar.get(Calendar.YEAR),
                                                    birthdayCalendar.get(Calendar.MONTH), birthdayCalendar.get(Calendar.DAY_OF_MONTH))

        datePickerDialog!!.show()
    }

    fun startSmokeDialog(view: View) {
        val context: Context = view.context
        var datePickerDialog = DatePickerDialog(context, startSmokePickerListener, startSmokeCalendar.get(Calendar.YEAR),
            startSmokeCalendar.get(Calendar.MONTH), startSmokeCalendar.get(Calendar.DAY_OF_MONTH))

        datePickerDialog!!.show()
    }
}