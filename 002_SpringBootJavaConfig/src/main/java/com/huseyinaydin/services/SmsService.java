package com.huseyinaydin.services;

public class SmsService implements MessageService {

	@Override
	public void sendMessage(String message) {
		System.out.println(message);
	}

}
