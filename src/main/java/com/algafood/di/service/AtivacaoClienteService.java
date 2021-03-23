package com.algafood.di.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.algafood.di.Notificador.Notificador;
import com.algafood.di.Notificador.NotificadorEmail;
import com.algafood.di.modelo.Cliente;

@Component
public class AtivacaoClienteService {

	@Autowired
	private Notificador  notificador;

	@Autowired
	ApplicationEventPublisher eventPublisher;
	
	@PostConstruct
	public void init() {
		System.out.println("INITTI");
	}
	@PreDestroy
	public void destroyu() {
		System.out.println("DESTROy");
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
	}
	
}
