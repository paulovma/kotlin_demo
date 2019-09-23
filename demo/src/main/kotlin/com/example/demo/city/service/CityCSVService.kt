package com.example.demo.city.service

import com.example.demo.city.domain.CityRequest
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import java.io.InputStreamReader
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVFormat;

@Service
class CityCSVService {

    fun import(file: MultipartFile): Unit {
        val input: InputStreamReader = InputStreamReader(file.inputStream);
        val parser: CSVParser = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(input);

        parser.forEach {
            val cityRequest = CityRequest(it.get("name"), it.get("uf"));
        }

    }
}