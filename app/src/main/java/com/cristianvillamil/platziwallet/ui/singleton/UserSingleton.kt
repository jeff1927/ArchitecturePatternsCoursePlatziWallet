package com.cristianvillamil.platziwallet.ui.singleton

class UserSingleton {

    lateinit var userName: String

    companion object{
        private val instance: UserSingleton? = null

        fun getInstance(): UserSingleton {
            return instance ?: UserSingleton()
        }
    }

}