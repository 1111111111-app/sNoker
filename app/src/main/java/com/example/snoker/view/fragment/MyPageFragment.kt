package com.example.snoker.view.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.snoker.R
import com.example.snoker.base.BaseFragment
import com.example.snoker.databinding.FragmentMypageBinding

class MyPageFragment : BaseFragment<FragmentMypageBinding, MyPageViewModel>(R.layout.fragment_mypage){
    companion object {
        const val TAG: String = "MyPageFragment"

        fun newInstance() : MyPageFragment {
            return MyPageFragment()
        }
    }

    override val viewModel: MyPageViewModel = MyPageViewModel()

    override fun initStartView(container: ViewGroup?) {
        var binding: FragmentMypageBinding = DataBindingUtil.inflate(this.layoutInflater, layoutResourceId, container, false)
        binding.viewmodel = viewModel
    }

    override fun initDataBinding() {


    }

    override fun initAfterBinding() {
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView = super.onCreateView(inflater, container, savedInstanceState)

        return rootView
    }
}