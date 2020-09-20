package com.example.snoker.view.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.snoker.R
import com.example.snoker.data.Post
import com.example.snoker.data.PostListAdapter
import kotlinx.android.synthetic.main.fragment_board.*

class BoardFragment : Fragment() {
    private lateinit var postRecyclerView : RecyclerView

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
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView = inflater.inflate(R.layout.fragment_board, container, false)

        Log.d(TAG, "BoardFragment on Create View Called")
        postRecyclerView = rootView.findViewById(R.id.postList!!)
        postRecyclerView.layoutManager = LinearLayoutManager(this.activity)
        postRecyclerView.adapter = PostListAdapter()

        Log.d(TAG, "List Adapter Init")

        Log.d(TAG, "Post List Adapter Init")
        return rootView
    }
}