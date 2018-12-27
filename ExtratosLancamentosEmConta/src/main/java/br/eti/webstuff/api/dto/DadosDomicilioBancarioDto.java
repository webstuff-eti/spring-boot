package br.eti.webstuff.api.dto;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class DadosDomicilioBancarioDto {

	
	//@NotEmpty(message="Código do banco não pode ser vazio.")
	//@Length(min=3, max=6, message="Código do banco deve estar entre 1 e 6 caracteres.")
	private Integer codigoBanco;	
	
	//@NotEmpty(message="Número da Agência não pode ser vazio.")
	//@Length(min=1, max=5, message="O número da agência deve estar entre 1 e 5 caracteres.")
	private Integer numeroAgencia;
	
	@NotEmpty(message="Número da conta corrente não pode ser vazio.")
	@Length(min=5, max=14, message="O número da conta corrente deve estar entre 5 e 14 caracteres.")
	private String numeroContaCorrente;
	
	
	public Integer getCodigoBanco() {
		return codigoBanco;
	}
	public void setCodigoBanco(Integer codigoBanco) {
		this.codigoBanco = codigoBanco;
	}
	public Integer getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(Integer numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}
	public void setNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}
	
	
}
