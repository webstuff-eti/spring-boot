package br.eti.webstuff.api.dto;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class ControleLancamentoDto {

	private Integer numeroEvento;
	private Integer quantidadeLancamentoRemessa;
	private String dataEfetivaLancamento;
	private String dataLancamentoContaCorrenteCliente;
	private String descricaoGrupoPagamento;
	private String codigoIdentificadorUnico;
	private String nomeBanco;
	
	@NotEmpty(message="Número raiz CNPJ não pode ser vazio.")
	@Length(min=8, max=8, message="O número raiz CNPJ deve conter 8 caracteres.")
	private String numeroRaizCNPJ;
	
	private String numeroSufixoCNPJ;
	private BigDecimal valorLancamentoRemessa;

	private LancamentoContaCorrenteClienteDto lancamentoContaCorrenteCliente;
	
	
	public ControleLancamentoDto() {
		
	}

	public Integer getNumeroEvento() {
		return numeroEvento;
	}

	public void setNumeroEvento(Integer numeroEvento) {
		this.numeroEvento = numeroEvento;
	}

	public Integer getQuantidadeLancamentoRemessa() {
		return quantidadeLancamentoRemessa;
	}

	public void setQuantidadeLancamentoRemessa(Integer quantidadeLancamentoRemessa) {
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
	}

	public String getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}

	public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}

	public String getDataLancamentoContaCorrenteCliente() {
		return dataLancamentoContaCorrenteCliente;
	}

	public void setDataLancamentoContaCorrenteCliente(String dataLancamentoContaCorrenteCliente) {
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
	}

	public String getDescricaoGrupoPagamento() {
		return descricaoGrupoPagamento;
	}

	public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
	}

	public String getCodigoIdentificadorUnico() {
		return codigoIdentificadorUnico;
	}

	public void setCodigoIdentificadorUnico(String codigoIdentificadorUnico) {
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public String getNumeroRaizCNPJ() {
		return numeroRaizCNPJ;
	}

	public void setNumeroRaizCNPJ(String numeroRaizCNPJ) {
		this.numeroRaizCNPJ = numeroRaizCNPJ;
	}

	public String getNumeroSufixoCNPJ() {
		return numeroSufixoCNPJ;
	}

	public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
	}

	public BigDecimal getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}

	public void setValorLancamentoRemessa(BigDecimal valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
	}

	public LancamentoContaCorrenteClienteDto getLancamentoContaCorrenteCliente() {
		return lancamentoContaCorrenteCliente;
	}

	public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteClienteDto lancamentoContaCorrenteCliente) {
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
	}

	@Override
	public String toString() {
		return "ControleLancamentoDto [numeroEvento=" + numeroEvento + ", quantidadeLancamentoRemessa="
				+ quantidadeLancamentoRemessa + ", dataEfetivaLancamento=" + dataEfetivaLancamento
				+ ", dataLancamentoContaCorrenteCliente=" + dataLancamentoContaCorrenteCliente
				+ ", descricaoGrupoPagamento=" + descricaoGrupoPagamento + ", codigoIdentificadorUnico="
				+ codigoIdentificadorUnico + ", nomeBanco=" + nomeBanco + ", numeroRaizCNPJ=" + numeroRaizCNPJ
				+ ", numeroSufixoCNPJ=" + numeroSufixoCNPJ + ", valorLancamentoRemessa=" + valorLancamentoRemessa + "]";
	}

}
