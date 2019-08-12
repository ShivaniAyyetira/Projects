package com.xworkz.mail.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class javamailsend {

	public static void main(String[] args) {
		
ApplicationContext context = new ClassPathXmlApplicationContext("resource/spring.xml");
JavaMailSender mailSend = context.getBean(JavaMailSenderImpl.class);
SimpleMailMessage message = context.getBean(SimpleMailMessage.class);

message.setTo("lavanyagovinda1995@gmail.com");
message.setSubject("Sending");
message.setText("This is java mail");
mailSend.send(message);

System.out.println("Mail sent");

	}

}
