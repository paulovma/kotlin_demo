package com.example.demo.city.api

import com.example.demo.city.domain.CityRequest
import com.example.demo.city.service.CityService
import com.example.demo.entity.City
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("city")
class CityAPI {

    @Autowired
    private lateinit var cityService: CityService;

    @GetMapping(value = "", produces = ["application/json"] )
    fun list(): List<City> {
        return cityService.findAll();
    }

    @PostMapping(value = "", produces = ["application/json"])
    fun add(@RequestBody city: CityRequest): Boolean {
        return cityService.insert(city);
    }
}