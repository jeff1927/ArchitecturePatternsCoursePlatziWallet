package com.cristianvillamil.platziwallet.ui.adapter

class UserAdapter {
    fun getUserModel (userResponse: UserResponse) : UserModel {
        return UserModel(userResponse.userName, userResponse.userPhotoUrl)
    }
}