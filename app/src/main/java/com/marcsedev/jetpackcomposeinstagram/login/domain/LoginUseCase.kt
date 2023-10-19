package com.marcsedev.jetpackcomposeinstagram.login.domain

import com.marcsedev.jetpackcomposeinstagram.login.data.LoginRepository

class LoginUseCase {
    private val repository = LoginRepository()

    suspend operator fun invoke(user: String, password: String): Boolean {
        return repository.doLogin(user, password)
    }
}