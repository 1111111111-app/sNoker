package com.example.snoker.view.register

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.View
import android.widget.DatePicker
import android.widget.TimePicker
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import com.example.snoker.base.BaseViewModel
import com.example.snoker.view.smokeinfo.SmokeInfoActivity
import java.util.*

class UserRegisterViewModel : BaseViewModel() {

    companion object {
        private var instance: UserRegisterViewModel? = null
        fun getInstance() = instance ?: synchronized(UserRegisterViewModel::class.java) {
            instance ?: UserRegisterViewModel().also { instance = it }
        }
    }

    private val TAG = "UserRegisterActivity"
    private val INIT_TEXT = "선택"

    private var birthdayCalendar = Calendar.getInstance()
    private var stopSmokeCalendar = Calendar.getInstance()

    val birthdayYear = ObservableField<String>(INIT_TEXT)
    val birthdayMonth = ObservableField<String>(INIT_TEXT)
    val birthdayDay = ObservableField<String>(INIT_TEXT)

    val stopSmokeYear = ObservableField<String>(INIT_TEXT)
    val stopSmokeMonth = ObservableField<String>(INIT_TEXT)
    val stopSmokeDay = ObservableField<String>(INIT_TEXT)
    val stopSmokeHour = ObservableField<String>(INIT_TEXT)

    var isBirthDayCheck: Boolean = false
    var isStopSMokeDayCheck: Boolean = false
    var isStopSmokeHourCheck: Boolean = false
    var isGenderCheck: Boolean = false

    var isMaleSelected= MutableLiveData<Boolean>()
    var isFemaleSelected= MutableLiveData<Boolean>()
    var isActiveButton = MutableLiveData<Boolean>().apply {
        this.value = false
    }

    private fun checkAllUserInfo() : Boolean {
        return isBirthDayCheck && isStopSMokeDayCheck && isStopSmokeHourCheck && isGenderCheck
    }


    private var birthDayPickerListener = object: DatePickerDialog.OnDateSetListener{
        override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
            birthdayCalendar!!.set(Calendar.YEAR, year)
            birthdayCalendar!!.set(Calendar.MONTH, month)
            birthdayCalendar!!.set(Calendar.DAY_OF_MONTH, dayOfMonth)

            birthdayYear.set(year.toString())
            birthdayMonth.set(month.toString())
            birthdayDay.set(dayOfMonth.toString())

            isBirthDayCheck = true
            isActiveButton.value = checkAllUserInfo()
            Log.d(TAG, isActiveButton.value.toString())

        }
    }

    private var stopSmokePickerListener = object: DatePickerDialog.OnDateSetListener{
        override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
            stopSmokeCalendar!!.set(Calendar.YEAR, year)
            stopSmokeCalendar!!.set(Calendar.MONTH, month)
            stopSmokeCalendar!!.set(Calendar.DAY_OF_MONTH, dayOfMonth)

            stopSmokeYear.set(year.toString())
            stopSmokeMonth.set(month.toString())
            stopSmokeDay.set(dayOfMonth.toString())

            isStopSMokeDayCheck = true
            isActiveButton.value = checkAllUserInfo()
            Log.d(TAG, isActiveButton.value.toString())
        }
    }

    private var stopSmokeTimeDialogListener: TimePickerDialog.OnTimeSetListener = object: TimePickerDialog.OnTimeSetListener{
        override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
            stopSmokeCalendar!!.set(Calendar.HOUR, hourOfDay)
            stopSmokeCalendar!!.set(Calendar.MINUTE, minute)

            stopSmokeHour.set(hourOfDay.toString())

            isStopSmokeHourCheck = true
            isActiveButton.value = checkAllUserInfo()
            Log.d(TAG, isActiveButton.value.toString())
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

    fun stopSmokeDialog(view: View) {
        val context: Context = view.context
        var datePickerDialog = DatePickerDialog(context, stopSmokePickerListener, stopSmokeCalendar.get(Calendar.YEAR),
            stopSmokeCalendar.get(Calendar.MONTH), stopSmokeCalendar.get(Calendar.DAY_OF_MONTH))

        datePickerDialog!!.show()
    }

    fun stopSmokeTimeDialog(view: View) {
        val context: Context = view.context
        var timePickerDialog = TimePickerDialog(context, stopSmokeTimeDialogListener, stopSmokeCalendar.get(Calendar.HOUR), stopSmokeCalendar.get(Calendar.MINUTE), true)

        timePickerDialog!!.show()
    }
    fun maleButtonCallback(view: View) {
        isMaleSelected.value = true
        isFemaleSelected.value = false
        isGenderCheck = true
        isActiveButton.value = checkAllUserInfo()
    }

    fun femaleButtonCallback(view: View) {
        isFemaleSelected.value = true
        isMaleSelected.value = false
        isGenderCheck = true
        isActiveButton.value = checkAllUserInfo()
    }
}