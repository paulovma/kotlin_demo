package com.example.demo.entity

import javax.persistence.*

@Entity
@Table
class City(
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        val id: Long = 0L,
        val name: String = "",
        val state: String = ""
) {

//    constructor() : this("", "");

}