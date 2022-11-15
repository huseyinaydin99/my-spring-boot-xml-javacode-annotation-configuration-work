package com.huseyinaydin.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.huseyinaydin.services.MessageProcessor;

@SpringBootApplication
public class Application {

	private static ApplicationContext applicationContext;
	
	public static void main(String[] args) {
		applicationContext = SpringApplication.run(Application.class, args);
		
		MessageProcessor messageProcessor = (MessageProcessor) applicationContext.getBean("messageProcessorImpl");
		messageProcessor.processMsg("Selamlar");
	}

}
