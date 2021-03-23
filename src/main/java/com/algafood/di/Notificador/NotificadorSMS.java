package com.algafood.di.Notificador;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.algafood.di.modelo.Cliente;

@Primary
@Component
public class NotificadorSMS implements Notificador {
	 

	@Override
	public void notificar(Cliente cliente, String mensagem) {
	 

		System.out.printf("notificando por SMS %s do cliente %s : %s\n", cliente.getTelefone(), cliente.getNome(),
				mensagem);
	}

 
}
