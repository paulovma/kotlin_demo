package com.example.demo.city.api

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController
@RequestMapping("/import")
class CityCSVAPI {

    fun import(file: MultipartFile): Unit {
    }
}