package com.huseyinaydin.services;

public class EmailService implements MessageService {

	@Override
	public void sendMessage(String message) {
		System.out.println(message);
	}

}
