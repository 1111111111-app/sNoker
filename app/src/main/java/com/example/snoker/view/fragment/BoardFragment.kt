package com.example.snoker.view.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.snoker.R
//import com.example.snoker.data.PostListAdapter
import kotlinx.android.synthetic.main.fragment_board.*

class BoardFragment : Fragment() {

    //private var postListAdapter = PostListAdapter()
    companion object {
        const val TAG: String = "BoardFragment"

        fun newInstance() : BoardFragment {
            return BoardFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "BoardFragment On create Called")
    }

    // 프레그먼트를 안고 있는 액티비티에 붙었을때
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "BoardFragment on Attach Called")
//        postList.adapter = postListAdapter
//        postList.layoutManager = LinearLayoutManager(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "BoardFragment on Create View Called")

        return inflater.inflate(R.layout.fragment_board, container, false)
    }
}