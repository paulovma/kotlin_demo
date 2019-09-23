package com.example.demo.city.service

import com.example.demo.city.domain.CityRepository
import com.example.demo.city.domain.CityRequest
import com.example.demo.city.domain.StateEnum
import com.example.demo.city.mapper.Mapper
import com.example.demo.entity.City
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class CityService {

    @Autowired
    private lateinit var cityMapper: Mapper<CityRequest, City>;

    @Autowired
    private lateinit var cityRepository: CityRepository;

    @Transactional(readOnly = true)
    fun findAll(): List<City> {
        var sp = StateEnum.SP.state;
        return cityRepository.findAll();
    }

    fun insert(cityRequest: CityRequest): Boolean {
        val city: City = cityMapper.convert(cityRequest);
        cityRepository.save(city);

        return city.id != 0L;
    }
}