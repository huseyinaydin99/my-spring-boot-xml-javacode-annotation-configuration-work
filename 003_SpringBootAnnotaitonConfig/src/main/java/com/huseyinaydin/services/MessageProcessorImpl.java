package com.huseyinaydin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageProcessorImpl implements MessageProcessor {

	@Autowired
	@Qualifier("emailService")
	private MessageService messageService;
	
	@Override
	public void processMsg(String message) {
		System.out.println(message);
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

}
