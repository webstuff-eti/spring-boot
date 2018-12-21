package br.eti.webstuff.api;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class ExtratosLancamentosEmContaApplicationTests {
	
	@Value("${parametro.configuracao.ambiente}")
	private String ambiente;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void verificaContextoDeAmbiente () {
		Assert.assertEquals("desenvolvimento", ambiente);
	}

}

