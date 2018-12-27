package br.eti.webstuff.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import br.eti.webstuff.api.controller.DadosDomicilioBancarioController;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class ExtratosLancamentosEmContaApplicationTests {
	
	private static final Logger log = (Logger) LoggerFactory.getLogger(DadosDomicilioBancarioController.class);
	
	@Value("${parametro.configuracao.ambiente}")
	private String ambiente;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void verificaContextoDeAmbiente () {
		
		if(ambiente.equals("development")) {
			Assert.assertEquals("development", ambiente);
			log.info("Ambinte de desenvolvimento de: "+ ambiente);
			
		}else if(ambiente.equals("test")) {
			Assert.assertEquals("test", ambiente);
			log.info("Ambinte de desenvolvimento de: "+ ambiente);
		}
		
	}

}

