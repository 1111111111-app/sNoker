package com.example.snoker.data

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.snoker.R

class PostListAdapter : RecyclerView.Adapter<PostListAdapter.PostViewHolder>() {
    //items MutableList, MutableList는 item을 추가할 수 있다.
    var items: MutableList<Post> = mutableListOf(
        Post("Tom", "금연하는중입니다", "오늘", 1),
        Post("Leo", "금연하기싫다", "어제", 2),
        Post("Jamey", "금연 왜함?", "오늘", 3)
    )

    //뷰홀더 생성
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int) = PostViewHolder(p0)

    //item 사이즈
    override fun getItemCount(): Int = items.size

    //여기서 item을 textview에 옮겨준다.
    override fun onBindViewHolder(p0: PostViewHolder, p1: Int) {
        items[p1].let { item ->
            with(p0) {
//                Fullname.text = item.fullname
////                Quiz.text = item.quiz
            }
        }
    }
    inner class PostViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.post_list_item, parent, false)) {
//        val Fullname = itemView.search_fullname
//        val Quiz = itemView.search_quiz
    }
}