package com.example.snoker.view.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import com.example.snoker.R
import com.example.snoker.base.BaseActivity
import com.example.snoker.databinding.ActivityMainBinding
import com.example.snoker.view.fragment.MainFragment
import com.example.snoker.view.fragment.MyPageFragment
import com.example.snoker.view.fragment.ProgressFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(),
    BottomNavigationView.OnNavigationItemSelectedListener {

    private lateinit var mainFragment: MainFragment
    private lateinit var progressFragment: ProgressFragment
    private lateinit var myPageFragment: MyPageFragment

    companion object {
        const val TAG: String = "MainActivity"
    }

    override val layoutResourceId: Int
        get() = R.layout.activity_main

    override val viewModel: MainViewModel = MainViewModel()

    override fun initStartView() {
    }

    override fun initDataBinding() {
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, layoutResourceId)
        binding.viewmodel = viewModel

        navigation.setOnNavigationItemSelectedListener(this)
        mainFragment = MainFragment.newInstance()
        supportFragmentManager.beginTransaction()
            .add(R.id.frame, mainFragment)
            .commit()
    }

    override fun initAfterBinding() {

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        Log.d(TAG, "MainActivity on Navigation Item Selected Call")

        when(item.itemId) {
            R.id.main -> {
                Log.d(TAG, "MainAcitivity 메인버튼 클릭")
                mainFragment = MainFragment.newInstance()
                supportFragmentManager.beginTransaction()
                                        .replace(R.id.frame, mainFragment)
                                        .commit()
            }
            R.id.progress -> {
                Log.d(TAG, "MainAcitivity 프로그래스버튼 클릭")
                progressFragment = ProgressFragment.newInstance()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frame, progressFragment)
                    .commit()
            }
            R.id.mypage -> {
                Log.d(TAG, "MainAcitivity 마이페이지버튼 클릭")
                myPageFragment = MyPageFragment.newInstance()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frame, myPageFragment)
                    .commit()
            }
        }
        return true
    }

}