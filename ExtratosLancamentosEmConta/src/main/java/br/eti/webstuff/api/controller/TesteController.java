package br.eti.webstuff.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exemplo")
public class TesteController {
	
	
	@GetMapping(value = "/{nome}")
	public String exemplo(@PathVariable("nome") String nome) {
		 return "Testando " + nome;
	}
	
	@GetMapping(value = "/teste")
	public String arquitetura() {
		 return "Testando Verbo GET: SUCESSO!";
	}

}
