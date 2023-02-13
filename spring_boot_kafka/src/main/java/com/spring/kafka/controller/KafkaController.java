package com.spring.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.kafka.producer.Producer;

@RestController
@RequestMapping("/kafkaapp")
public class KafkaController {

	@Autowired 
	Producer producer;
	
	@PostMapping(value="/post")
	public void sendMessage(@RequestParam("msg") String msg) {
		producer.publishToTopic(msg);
	}
}
//http:localhost:8888/kafkaapp/post?msg=Hello