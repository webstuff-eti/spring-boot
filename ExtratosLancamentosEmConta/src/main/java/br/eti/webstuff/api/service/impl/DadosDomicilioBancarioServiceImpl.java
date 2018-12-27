package br.eti.webstuff.api.service.impl;

import java.util.Optional;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.eti.webstuff.api.entity.DadosDomicilioBancario;
import br.eti.webstuff.api.repository.DadosDomicilioBancarioRepository;
import br.eti.webstuff.api.service.DadosDomicilioBancarioService;

@Service
public class DadosDomicilioBancarioServiceImpl implements DadosDomicilioBancarioService {
	
	//private static final Logger log = (Logger) LoggerFactory.getLogger(DadosDomicilioBancarioServiceImpl.class);
	
	private DadosDomicilioBancarioRepository  repository;
	
	@Autowired
	public DadosDomicilioBancarioServiceImpl(DadosDomicilioBancarioRepository  repository) {
	    this.repository = repository;	
	}

	@Override
	public Optional<DadosDomicilioBancario> buscaDadosDomicilioBancarioPeloNumeroContaCorrente(String numeroContaCorrente) {
		
		//log.info("Buscando um DadosDomicilioBancario para o numeroContaCorrente {}" + numeroContaCorrente);
		return Optional.ofNullable(repository.findByNumeroContaCorrente(numeroContaCorrente));
	}

	@Override
	public DadosDomicilioBancario persistir(DadosDomicilioBancario dadosDomicilioBancario) {
		
		return this.repository.save(dadosDomicilioBancario);
	}
	
}
