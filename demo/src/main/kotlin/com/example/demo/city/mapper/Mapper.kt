package com.example.demo.city.mapper

interface Mapper<T, Y> {

    fun convert(entity: T): Y;
}