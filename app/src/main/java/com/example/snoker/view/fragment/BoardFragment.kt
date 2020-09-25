package com.example.snoker.view.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.snoker.R
import com.example.snoker.base.BaseFragment
import com.example.snoker.data.PostListAdapter
import com.example.snoker.databinding.FragmentBoardBinding

class BoardFragment : BaseFragment<FragmentBoardBinding, BoardViewModel>(R.layout.fragment_board) {
    private lateinit var postRecyclerView : RecyclerView

    companion object {
        const val TAG: String = "BoardFragment"

        fun newInstance() : BoardFragment {
            return BoardFragment()
        }
    }

    override val viewModel: BoardViewModel = BoardViewModel()

    override fun initStartView(container: ViewGroup?) {
        var binding: FragmentBoardBinding = DataBindingUtil.inflate(this.layoutInflater, layoutResourceId, container, false)
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

        Log.d(TAG, "BoardFragment on Create View Called")
        postRecyclerView = rootView!!.findViewById(R.id.postList!!)
        postRecyclerView.layoutManager = LinearLayoutManager(this.activity)
        postRecyclerView.adapter = PostListAdapter()

        return rootView
    }
}