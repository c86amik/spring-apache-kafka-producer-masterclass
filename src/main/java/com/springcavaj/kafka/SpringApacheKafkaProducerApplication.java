package com.springcavaj.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author springcavaj
 *
 */
@SpringBootApplication
public class SpringApacheKafkaProducerApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringApacheKafkaProducerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringApacheKafkaProducerApplication.class, args);
		LOGGER.info("Spring Boot Apache Kafka Application Started");
	}

}
