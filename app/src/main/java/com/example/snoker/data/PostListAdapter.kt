package com.example.snoker.data

import android.service.autofill.TextValueSanitizer
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.snoker.R

class PostListAdapter {

}

//class PostListAdapter : RecyclerView.Adapter<PostListAdapter.PostViewHolder>(){
//    private val TAG = "Post List Adapter"
//
//    var items: MutableList<Post> = mutableListOf(
//        Post("Tom", "금연중입니다", 1, "오늘"),
//        Post("Jamey", "금연안할래", 3, "어제"),
//        Post("Leo", "금연 왜함?", 4, "오늘")
//    )
//
//    //뷰홀더 생성
//    override fun onCreateViewHolder(p0: ViewGroup, p1: Int) = PostViewHolder(p0)
//
//    //item 사이즈
//    override fun getItemCount(): Int = items.size
//
//    //여기서 item을 textview에 옮겨준다.
//    override fun onBindViewHolder(p0: PostViewHolder, p1: Int) {
//        Log.d(TAG, "Bind View Holder!")
//
//        items[p1].let { item ->
//            with(p0) {
//                userNickName.text = item.writer
//                postText.text = item.text
//                userStopSmokeDay.text = item.stopSmokedDay.toString()
//                createdAt.text = item.createdAt
//            }
//        }
//    }
//
//    inner class PostViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
//        LayoutInflater.from(parent.context).inflate(R.layout.post_list_item, parent, false)) {
//        val userNickName = itemView.userNickNameText
//        val userStopSmokeDay = itemView.stopSmokeDayText
//        val createdAt = itemView.createdAtText
//        val postText = itemView.postText
//    }
//}