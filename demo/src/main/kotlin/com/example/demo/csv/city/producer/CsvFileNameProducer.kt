package com.example.demo.csv.city.producer

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.kafka.core.KafkaTemplate;

@Component
class CsvFileNameProducer(
        private val kafkaTemplate: KafkaTemplate<String, String>
) {

    private val logger: Logger = LoggerFactory.getLogger(javaClass);

    fun send(message: String) {
        logger.info("producing message = {}", message)
        kafkaTemplate.send("status", message);
    }

}