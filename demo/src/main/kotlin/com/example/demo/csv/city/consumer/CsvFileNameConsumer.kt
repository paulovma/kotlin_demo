package com.example.demo.csv.city.consumer

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.kafka.annotation.KafkaListener;

@Component
class CsvFileNameConsumer {

    private val logger = LoggerFactory.getLogger(javaClass);

    @KafkaListener(topics = ["status"], groupId = "simple-kotlin-consumer")
    fun processMessage(message: String) {
        logger.info("message: {}", message);
    }

}