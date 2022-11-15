package com.huseyinaydin.services;

import org.springframework.stereotype.Service;

@Service(value = "smsService")
public class SmsService implements MessageService {

	@Override
	public void sendMessage(String message) {
		System.out.println(message);
	}

}
