package com.spring.activemq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class SendService {

	
	private JmsTemplate jmsTemplate;

	@Autowired
	public SendService(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}
	
	public void sendName(String name)
	{
		jmsTemplate.convertAndSend("student",name);
		
	}

}
