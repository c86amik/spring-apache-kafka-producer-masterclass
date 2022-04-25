/**
 * 
 */
package com.springcavaj.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.springcavaj.kafka.model.UserModel;

/**
 * @author springcavaj
 *
 */
@Service
public class SpringApacheKafkaSenderService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringApacheKafkaSenderService.class);
	
	@Autowired
	@Qualifier("kafkaJsonTemplate")
	private KafkaTemplate<String, UserModel> kafkaJsonTemplate;
	
	private final static String APACHE_KAFKA_TOPIC_NAME = "springcavaj-topic";
	
	public void send(UserModel userModel) {
		LOGGER.info("Data to be sent to Kafka - {}", userModel);
		kafkaJsonTemplate.send(APACHE_KAFKA_TOPIC_NAME, userModel);
	}

}
