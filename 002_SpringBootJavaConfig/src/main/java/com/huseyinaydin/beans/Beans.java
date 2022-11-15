package com.huseyinaydin.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.huseyinaydin.services.EmailService;
import com.huseyinaydin.services.MessageProcessor;
import com.huseyinaydin.services.MessageProcessorImpl;

@Configuration
public class Beans {
	
	@Autowired
	private ApplicationContext appCtx;
	
	@Bean(name = "messageProcessor")
	public MessageProcessor getMessageProcessorImpl() {
		MessageProcessorImpl messageProcessorImpl = new MessageProcessorImpl();
		messageProcessorImpl.setMessageService(this.appCtx.getBean("emailService", EmailService.class));
		return messageProcessorImpl;
	}
	
	@Bean(name = "emailService")
	public EmailService getEmailService() {
		return new EmailService();
	}
}
