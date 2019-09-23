package com.example.demo.city.mapper

import com.example.demo.city.domain.CityRequest
import com.example.demo.entity.City
import org.springframework.stereotype.Component

@Component
class CityMapper: Mapper<CityRequest, City> {

    override fun convert(entity: CityRequest): City {
        return City(0L, entity.name, entity.state);
    }

}