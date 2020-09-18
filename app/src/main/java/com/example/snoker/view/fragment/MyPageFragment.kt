package com.example.snoker.view.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.snoker.R

class MyPageFragment : Fragment() {
    companion object {
        const val TAG: String = "MyPageFragment"

        fun newInstance() : MyPageFragment {
            return MyPageFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "MyPageFragment On create Called")
    }

    // 프레그먼트를 안고 있는 액티비티에 붙었을때
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "MyPageFragment on Attach Called")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "MyPageFragment on Create View Called")

        return inflater.inflate(R.layout.fragment_mypage, container, false)
    }
}