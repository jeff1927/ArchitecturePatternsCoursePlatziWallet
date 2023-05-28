package com.cristianvillamil.platziwallet.ui.adapter

data class UserResponse(
    val id: String,
    val userName: String,
    val token: String,
    val userPhotoUrl: String,
    val tokenTransfer: String
)