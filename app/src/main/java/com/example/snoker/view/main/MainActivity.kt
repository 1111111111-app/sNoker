package com.example.snoker.view.main

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.snoker.R
import com.example.snoker.view.main.fragment.BoardFragment
import com.example.snoker.view.main.fragment.MainFragment
import com.example.snoker.view.main.fragment.MyPageFragment
import com.example.snoker.view.main.fragment.ProgressFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    private lateinit var mainFragment: MainFragment
    private lateinit var progressFragment: ProgressFragment
    private lateinit var myPageFragment: MyPageFragment
    private lateinit var boardFragment: BoardFragment

    companion object {
        const val TAG: String = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navigation.setOnNavigationItemSelectedListener(this)
        mainFragment = MainFragment.newInstance()
        supportFragmentManager.beginTransaction()
            .add(R.id.frame, mainFragment)
            .commit()
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
            R.id.board -> {
                Log.d(TAG, "MainAcitivity 게시판버튼 클릭")
                boardFragment = BoardFragment.newInstance()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frame, boardFragment)
                    .commit()
            }
        }
        return true
    }

}