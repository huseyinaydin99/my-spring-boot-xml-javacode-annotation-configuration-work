package com.huseyinaydin.services;

import org.springframework.stereotype.Service;

@Service(value = "emailService")
public class EmailService implements MessageService {

	@Override
	public void sendMessage(String message) {
		System.out.println(message);
	}

}
