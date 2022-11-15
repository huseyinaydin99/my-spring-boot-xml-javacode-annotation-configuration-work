package com.huseyinaydin.services;

public class MessageProcessorImpl implements MessageProcessor {

	private MessageService messageService;
	
	@Override
	public void processMsg(String message) {
		System.out.println(message);
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

}
