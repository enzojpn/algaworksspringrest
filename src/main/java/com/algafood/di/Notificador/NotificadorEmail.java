package com.algafood.di.Notificador;

import org.springframework.stereotype.Component;

import com.algafood.di.modelo.Cliente;

@Component
public class NotificadorEmail implements Notificador {
 

	@Override
	public void notificar(Cliente cliente, String mensagem) {
	 

		System.out.printf("notificando o email %s do cliente %s : %s\n", cliente.getEmail(), cliente.getNome(),
				mensagem);
	}
 
}
