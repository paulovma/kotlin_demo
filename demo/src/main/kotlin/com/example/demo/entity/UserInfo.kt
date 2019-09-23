package com.example.demo.entity

import javax.persistence.*

@Entity
@Table
class UserInfo (
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        val id: Long = 0,
        val name: String = "",
        val email: String = "",
        val password: String =""
) {
}