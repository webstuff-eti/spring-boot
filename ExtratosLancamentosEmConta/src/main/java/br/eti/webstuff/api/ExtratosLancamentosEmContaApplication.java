package br.eti.webstuff.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExtratosLancamentosEmContaApplication {

	@Value("${parametro.configuracao.ambiente}")
	private String ambiente;

	public static void main(String[] args) {
		SpringApplication.run(ExtratosLancamentosEmContaApplication.class, args);
	}

}
