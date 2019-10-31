package com.example.demo.csv.city.api

import com.example.demo.csv.city.dto.FileNameDTO
import com.example.demo.csv.city.service.PostCityCsvService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/csv")
class CityCsvAPI(@Autowired private val postCityCsvService: PostCityCsvService) {

    @PostMapping("")
    fun writeFile(@RequestBody filenameDTO: FileNameDTO) {
        postCityCsvService.write(filenameDTO);
    }

}