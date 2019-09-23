package com.example.demo.user.domain

import com.example.demo.entity.UserInfo

class UserRequest(
        val name: String = "",
        val email: String = "",
        val password: String = ""
) {
    fun toEntity(): UserInfo {
        return UserInfo(0, name, email, password);
    }
}