package com.huseyinaydin.services;

import org.springframework.stereotype.Service;

@Service(value = "twitterService")
public class TwitterService implements MessageService {

	@Override
	public void sendMessage(String message) {
		System.out.println(message);
	}

}
