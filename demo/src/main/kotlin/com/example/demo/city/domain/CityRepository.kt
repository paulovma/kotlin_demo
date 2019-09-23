package com.example.demo.city.domain

import com.example.demo.entity.City
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CityRepository : JpaRepository<City, Long> {
}