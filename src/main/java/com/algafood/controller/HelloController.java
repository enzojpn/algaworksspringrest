package com.algafood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algafood.di.modelo.Cliente;
import com.algafood.di.service.AtivacaoClienteService;

@Controller
public class HelloController {

	AtivacaoClienteService ativacaoClienteService;

	public HelloController(AtivacaoClienteService acs) {
		this.ativacaoClienteService = acs;

	}

	@GetMapping("/hello")
	@ResponseBody
	public String Hello() {
		Cliente cliente = new Cliente();
		cliente.setEmail("teste@teste.com");
		cliente.setTelefone("(11) 99899-1235");
		cliente.setNome("Rodolfo Matsushita");
		ativacaoClienteService.ativar(cliente);
		return "Hello algafood!";
	}

}
