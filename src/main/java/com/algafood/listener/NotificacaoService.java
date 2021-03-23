package com.algafood.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algafood.di.service.ClienteAtivadoEvent;
@Component
public class NotificacaoService {

	@EventListener
	public void clienteAtivadorListener(ClienteAtivadoEvent ev) {
		System.out.println("O cliente "+ ev.getCliente().getNome() + "esta ativado !!");
	}
}
