package com.example.snoker.data

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.snoker.R
import kotlinx.android.synthetic.main.post_list_item.view.*
import kotlinx.android.synthetic.main.search_list_item.view.*

class PostListAdapter : RecyclerView.Adapter<PostListAdapter.PostViewHolder>() {
    //items MutableList, MutableList는 item을 추가할 수 있다.
    var items: MutableList<Post> = mutableListOf(
        Post("Tom", "금연하는중입니다", "오늘", 1),
        Post("Leo", "금연하기싫다", "어제", 2),
        Post("Jamey", "금연 왜함?", "오늘", 3)

//        Post("제목1", "퀴즈1"),
//        Post("제목2", "퀴즈2"),
//        Post("제목3", "퀴즈3")
    )

    //뷰홀더 생성
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int) = PostViewHolder(p0)

    //item 사이즈
    override fun getItemCount(): Int = items.size

    //여기서 item을 textview에 옮겨준다.
    override fun onBindViewHolder(p0: PostViewHolder, p1: Int) {
        items[p1].let { item ->
            with(p0) {
                userNickName.text = item.userNickName
                postText.text = item.postText
                createdAt.text = item.createdAt
                smokingBan.text = "금연 " + item.smokingBan.toString() + "일째"
            }
        }
    }
    inner class PostViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.post_list_item, parent, false)) {
        val userNickName = itemView.userNickNameText
        val postText = itemView.postText
        val createdAt = itemView.createAtText
        val smokingBan = itemView.smoingBanText
    }
}