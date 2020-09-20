package com.example.snoker.view.smokeinfo


import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.DatePicker
import android.widget.TimePicker
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import com.example.snoker.R
import com.example.snoker.base.BaseViewModel
import com.example.snoker.view.main.MainActivity
import com.example.snoker.view.smokeinfo.SmokeInfoActivity
import kotlinx.android.synthetic.main.activity_smoke_info.*
import java.util.*

class SmokeInfoViewModel : BaseViewModel() {
    private val TAG = "SmokeInfoActivity"
    private var startSmokeCalendar = Calendar.getInstance()

    val startSmokeYear = ObservableField<String>("선택")
    val startSmokeMonth = ObservableField<String>("선택")
    val startSmokeDay = ObservableField<String>("선택")
    val startSmokeHour = ObservableField<String>("선택")

    val smokeCount = ObservableField<String>("선택")
    val smokeTime = ObservableField<String>("선택")

    var isStartSMokeDayCheck: Boolean = false
    var isStartSmokeHourCheck: Boolean = false
    var isSmokeCountCheck: Boolean = false
    var isSmokeTimeCheck: Boolean = false

    var isActiveButton = MutableLiveData<Boolean>().apply {
        this.value = false
    }

    private fun checkAllUserInfo() : Boolean {
        return isStartSMokeDayCheck && isStartSmokeHourCheck && isSmokeCountCheck && isSmokeTimeCheck
    }

    private var stopSmokePickerListener = object: DatePickerDialog.OnDateSetListener{
        override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
            startSmokeCalendar!!.set(Calendar.YEAR, year)
            startSmokeCalendar!!.set(Calendar.MONTH, month)
            startSmokeCalendar!!.set(Calendar.DAY_OF_MONTH, dayOfMonth)

            startSmokeYear.set(year.toString())
            startSmokeMonth.set(month.toString())
            startSmokeDay.set(dayOfMonth.toString())

            isStartSMokeDayCheck = true
            isActiveButton.value = checkAllUserInfo()
            Log.d(TAG, isActiveButton.value.toString())
        }
    }


    private var startSmokeTimeDialogListener: TimePickerDialog.OnTimeSetListener = object: TimePickerDialog.OnTimeSetListener{
        override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
            startSmokeCalendar!!.set(Calendar.HOUR, hourOfDay)
            startSmokeCalendar!!.set(Calendar.MINUTE, minute)

            startSmokeHour.set(hourOfDay.toString())

            isStartSmokeHourCheck = true
            isActiveButton.value = checkAllUserInfo()
            Log.d(TAG, isActiveButton.value.toString())
        }

    }

    fun startSmokeDialog(view: View) {
        val context: Context = view.context
        var datePickerDialog = DatePickerDialog(context, stopSmokePickerListener, startSmokeCalendar.get(Calendar.YEAR),
            startSmokeCalendar.get(Calendar.MONTH), startSmokeCalendar.get(Calendar.DAY_OF_MONTH))

        datePickerDialog!!.show()
    }

    fun startSmokeTimeDialog(view: View) {
        val context: Context = view.context
        var timePickerDialog = TimePickerDialog(context, startSmokeTimeDialogListener,
                                                        startSmokeCalendar.get(Calendar.HOUR),
                                                        startSmokeCalendar.get(Calendar.MINUTE),
                                            true)

        timePickerDialog!!.show()
    }

    fun contextMenuCheck(item: MenuItem) {
        when(item?.itemId) {
            R.id.countOne -> {
                smokeCount.set("1")
                isSmokeCountCheck = true
            }
            R.id.countTwo -> {
                smokeCount.set("2")
                isSmokeCountCheck = true
            }
            R.id.countThree -> {
                smokeCount.set("3")
                isSmokeCountCheck = true
            }
            R.id.countFour -> {
                smokeCount.set("4")
                isSmokeCountCheck = true
            }
            R.id.countFive -> {
                smokeCount.set("5")
                isSmokeCountCheck = true
            }
            R.id.countSix -> {
                smokeCount.set("6")
                isSmokeCountCheck = true
            }
            R.id.countSeven -> {
                smokeCount.set("7")
                isSmokeCountCheck = true
            }
            R.id.countEight -> {
                smokeCount.set("8")
                isSmokeCountCheck = true
            }
            R.id.countNine -> {
                smokeCount.set("9")
                isSmokeCountCheck = true
            }
            R.id.countTen -> {
                smokeCount.set("10")
                isSmokeCountCheck = true
            }
            R.id.countEleven -> {
                smokeCount.set("11")
                isSmokeCountCheck = true
            }
            R.id.countTwelve -> {
                smokeCount.set("12")
                isSmokeCountCheck = true
            }
            R.id.countThirteen -> {
                smokeCount.set("13")
                isSmokeCountCheck = true
            }
            R.id.countFourteen -> {
                smokeCount.set("14")
                isSmokeCountCheck = true
            }
            R.id.countFifteen -> {
                smokeCount.set("15")
                isSmokeCountCheck = true
            }
            R.id.countSixteen -> {
                smokeCount.set("16")
                isSmokeCountCheck = true
            }
            R.id.countSeventeen -> {
                smokeCount.set("17")
                isSmokeCountCheck = true
            }
            R.id.countEighteen -> {
                smokeCount.set("18")
                isSmokeCountCheck = true
            }
            R.id.countNineteen -> {
                smokeCount.set("19")
                isSmokeCountCheck = true
            }
            R.id.countTwenty -> {
                smokeCount.set("20")
                isSmokeCountCheck = true
            }
            R.id.countThirty -> {
                smokeCount.set("30")
                isSmokeCountCheck = true
            }
            R.id.countForty -> {
                smokeCount.set("40")
                isSmokeCountCheck = true
            }
            R.id.timeFive -> {
                smokeTime.set("5")
                isSmokeTimeCheck = true
            }
            R.id.timeTen -> {
                smokeTime.set("10")
                isSmokeTimeCheck = true
            }
            R.id.timeFifteen -> {
                smokeTime.set("15")
                isSmokeTimeCheck = true
            }
            R.id.timeTwenty -> {
                smokeTime.set("20")
                isSmokeTimeCheck = true
            }

        }
        isActiveButton.value = checkAllUserInfo()
    }

    fun moveNextActivity(view: View) {
        val context: Context = view.context
        val intent = Intent(context, MainActivity::class.java)
        context.startActivity(intent)
    }
}