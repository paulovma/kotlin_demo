package com.example.demo.csv.city.service

import com.example.demo.csv.city.dto.FileNameDTO
import com.example.demo.csv.city.producer.CsvFileNameProducer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PostCityCsvService(@Autowired private val csvFileNameProducer: CsvFileNameProducer) {

    fun write(fileNameDTO: FileNameDTO) {
        csvFileNameProducer.send(fileNameDTO.filename)
    }

}