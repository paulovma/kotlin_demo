package com.example.demo.user.service

import com.example.demo.entity.UserInfo
import com.example.demo.user.domain.UserRepository
import com.example.demo.user.domain.UserRequest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    private lateinit var userRepository: UserRepository

    fun createUser(user: UserRequest): UserInfo {
        return userRepository.save(user.toEntity());
    }
}