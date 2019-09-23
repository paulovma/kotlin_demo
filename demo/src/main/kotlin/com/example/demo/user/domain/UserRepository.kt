package com.example.demo.user.domain

import com.example.demo.entity.UserInfo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<UserInfo, Long> {
}