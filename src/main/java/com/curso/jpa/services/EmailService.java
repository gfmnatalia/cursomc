package com.curso.jpa.services;

import org.springframework.mail.SimpleMailMessage;

import com.curso.jpa.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
