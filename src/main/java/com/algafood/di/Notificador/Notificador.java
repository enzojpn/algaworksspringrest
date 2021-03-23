package com.algafood.di.Notificador;

import com.algafood.di.modelo.Cliente;

public interface Notificador {

	public void  notificar(Cliente cliente, String mensagem);
	
}
