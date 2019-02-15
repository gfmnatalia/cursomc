package com.curso.jpa.services;

import org.springframework.mail.SimpleMailMessage;

import com.curso.jpa.domain.Cliente;
import com.curso.jpa.domain.Pedido;


public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
	
	//void sendOrderConfirmationHtmlEmail(Pedido obj);
	
	//void sendHtmlEmail(MimeMessage msg); 
	
}
