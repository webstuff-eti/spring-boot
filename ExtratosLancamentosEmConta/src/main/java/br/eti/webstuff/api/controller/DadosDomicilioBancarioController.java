package br.eti.webstuff.api.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.eti.webstuff.api.dto.DadosDomicilioBancarioDto;
import br.eti.webstuff.api.entity.DadosDomicilioBancario;
import br.eti.webstuff.api.responses.Response;
import br.eti.webstuff.api.service.DadosDomicilioBancarioService;

@RestController
@RequestMapping("/api/dados/bancario")
@CrossOrigin("*")
public class DadosDomicilioBancarioController {

	private static final Logger log = (Logger) LoggerFactory.getLogger(DadosDomicilioBancarioController.class);

	private DadosDomicilioBancarioService service;

	@Autowired
	public DadosDomicilioBancarioController(DadosDomicilioBancarioService service) {
		this.service = service;
	}

	@PostMapping
	@RequestMapping("/novo")
	public ResponseEntity<Response<DadosDomicilioBancarioDto>> cadastrar(
			@Valid @RequestBody DadosDomicilioBancarioDto dadosDomicilioBancarioDto, BindingResult result) {

		final Logger log = (Logger) LoggerFactory.getLogger(DadosDomicilioBancarioController.class);

		log.info("Cadastro Dados Domicilio Bancario: {}", dadosDomicilioBancarioDto.toString());
		Response<DadosDomicilioBancarioDto> response = new Response<>();

		validaDadosExistentes(dadosDomicilioBancarioDto, result);
		DadosDomicilioBancario domicilioBancario = this.converteDtoParaDadosDomicilioBancario(dadosDomicilioBancarioDto);

		if (result.hasErrors()) {
			result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(response);
		}

		this.service.persistir(domicilioBancario);
		response.setData(dadosDomicilioBancarioDto);

		return ResponseEntity.ok(response);
	}

	

	@GetMapping(value = "/{numeroContaCorrente}")
	public DadosDomicilioBancarioDto buscaDadoDomiciliarBancarioPorContaCorrente(@PathVariable("numeroContaCorrente") String numeroContaCorrente, BindingResult result) {

		final Logger log = (Logger) LoggerFactory.getLogger(DadosDomicilioBancarioController.class);

		log.info("Busca Dados Domicilio Bancário pelo número da conta corrente: {}", numeroContaCorrente);
		Response<DadosDomicilioBancarioDto> response = new Response<>();
		
		Optional<DadosDomicilioBancario> dadoDomBancario = this.service
				.buscaDadosDomicilioBancarioPeloNumeroContaCorrente(numeroContaCorrente);
		
		validaDadosExistentesPorNumeroContaCorrente(dadoDomBancario, result); 

		return converteDadosDomicilioBancarioParaDto(dadoDomBancario);
	}

	
	
	// Validações
	private void validaDadosExistentes(DadosDomicilioBancarioDto dadosDomicilioBancarioDto, BindingResult result) {
		Optional<DadosDomicilioBancario> dadoDomBancario = this.service
				.buscaDadosDomicilioBancarioPeloNumeroContaCorrente(dadosDomicilioBancarioDto.getNumeroContaCorrente());
		if (dadoDomBancario.isPresent()) {
			result.addError(new ObjectError("DadosDomicilioBancario", "DomicilioBancario já cadastrado."));
		}
	}

	private void validaDadosExistentesPorNumeroContaCorrente(Optional<DadosDomicilioBancario> dadoDomBancario, BindingResult result) {
		
		if (!dadoDomBancario.isPresent()) {
			result.addError(new ObjectError("DadosDomicilioBancario", "DomicilioBancario não cadastrado."));
		}
	}
	
	
	// Conversores
	private DadosDomicilioBancario converteDtoParaDadosDomicilioBancario(DadosDomicilioBancarioDto dadosDomicilioBancarioDto) {
		
		DadosDomicilioBancario domicilioBancario = new DadosDomicilioBancario();
		domicilioBancario.setCodigoBanco(dadosDomicilioBancarioDto.getCodigoBanco());
		domicilioBancario.setNumeroAgencia(dadosDomicilioBancarioDto.getNumeroAgencia());
		domicilioBancario.setNumeroContaCorrente(dadosDomicilioBancarioDto.getNumeroContaCorrente());
		
		return domicilioBancario;
	}
	
	private DadosDomicilioBancarioDto converteDadosDomicilioBancarioParaDto(Optional<DadosDomicilioBancario> dadoDomBancario) {
		
		DadosDomicilioBancarioDto  dadosDomicilioBancarioDto = new DadosDomicilioBancarioDto();
		
		dadosDomicilioBancarioDto.setCodigoBanco(dadoDomBancario.get().getCodigoBanco()); 
		dadosDomicilioBancarioDto.setNumeroAgencia(dadoDomBancario.get().getNumeroAgencia());
		dadosDomicilioBancarioDto.setNumeroContaCorrente(dadoDomBancario.get().getNumeroContaCorrente());
		
		return dadosDomicilioBancarioDto;
	}

}
