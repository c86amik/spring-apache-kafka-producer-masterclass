/**
 * 
 */
package com.springcavaj.kafka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcavaj.kafka.model.UserModel;
import com.springcavaj.kafka.service.SpringApacheKafkaSenderService;

/**
 * @author springcavaj
 *
 */
@RestController
@RequestMapping(value="/kafka")
public class SpringApacheKafkaController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringApacheKafkaController.class);
	
	@Autowired
	private SpringApacheKafkaSenderService apacheKafkaSenderService;
	
	@PostMapping("/produceJson")
	public String produceJson(@RequestBody UserModel userModel) {
		String returnMsg = "Publish JSON User Model Message : " + userModel.toString();
		apacheKafkaSenderService.send(userModel);
		LOGGER.info(returnMsg);
		return returnMsg;
	}

}
