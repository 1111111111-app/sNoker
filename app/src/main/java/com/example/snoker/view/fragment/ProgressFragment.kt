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
import com.example.snoker.databinding.FragmentProgressBinding

class ProgressFragment : BaseFragment<FragmentProgressBinding, ProgressViewModel>(R.layout.fragment_progress) {
    companion object {
        const val TAG: String = "ProgressFragment"

        fun newInstance() : ProgressFragment {
            return ProgressFragment()
        }
    }

    override val viewModel: ProgressViewModel = ProgressViewModel()

    override fun initStartView(container: ViewGroup?) {
        var binding: FragmentProgressBinding = DataBindingUtil.inflate(this.layoutInflater, layoutResourceId, container, false)
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