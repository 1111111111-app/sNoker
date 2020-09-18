package com.example.snoker.view.main.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.snoker.R

class ProgressFragment : Fragment() {
    companion object {
        const val TAG: String = "ProgressFragment"

        fun newInstance() : ProgressFragment {
            return ProgressFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "ProgressFragment On create Called")
    }

    // 프레그먼트를 안고 있는 액티비티에 붙었을때
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "ProgressFragment on Attach Called")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "ProgressFragment on Create View Called")

        return inflater.inflate(R.layout.fragment_progress, container, false)
    }
}