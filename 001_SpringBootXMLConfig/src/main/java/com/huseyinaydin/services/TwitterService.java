package com.huseyinaydin.services;

public class TwitterService implements MessageService {

	@Override
	public void sendMessage(String message) {
		System.out.println(message);
	}

}
