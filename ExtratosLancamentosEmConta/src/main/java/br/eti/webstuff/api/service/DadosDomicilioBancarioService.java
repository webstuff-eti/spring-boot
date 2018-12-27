package br.eti.webstuff.api.service;

import java.util.Optional;

import br.eti.webstuff.api.entity.DadosDomicilioBancario;

public interface DadosDomicilioBancarioService {
	
	
	
	/**
	 * Retorna uma DadosDomicilioBancario dado um numeroContaCorrente.
	 * 
	 * @param numeroContaCorrente
	 * @return Optional<DadosDomicilioBancario>
	 */
	Optional<DadosDomicilioBancario> buscaDadosDomicilioBancarioPeloNumeroContaCorrente(String numeroContaCorrente);
	
	/**
	 * Cadastra uma novo DadosDomicilioBancario na base de dados.
	 * 
	 * @param dadosDomicilioBancario
	 * @return Empresa
	 */
	DadosDomicilioBancario persistir(DadosDomicilioBancario dadosDomicilioBancario);

}
