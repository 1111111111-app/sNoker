package com.example.snoker.data

data class Post(
// 작성자
var writer: String,
// 글 내용
var text: String,
// 금연 일수
var stopSmokedDay: Int,
// 작성일
var createdAt: String

)