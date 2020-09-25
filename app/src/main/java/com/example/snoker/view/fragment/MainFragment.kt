package com.example.snoker.view.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.snoker.R
import com.example.snoker.base.BaseFragment
import com.example.snoker.databinding.FragmentMainBinding
import com.example.snoker.view.fragment.MainViewModel

class MainFragment : BaseFragment<FragmentMainBinding, MainViewModel>(R.layout.fragment_main){

    companion object {
        const val TAG: String = "MainFragment"

        fun newInstance() : MainFragment {
            return MainFragment()
        }
    }

    override val viewModel: MainViewModel = MainViewModel()

    override fun initStartView(container: ViewGroup?) {
        var binding: FragmentMainBinding = DataBindingUtil.inflate(this.layoutInflater, layoutResourceId, container, false)
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