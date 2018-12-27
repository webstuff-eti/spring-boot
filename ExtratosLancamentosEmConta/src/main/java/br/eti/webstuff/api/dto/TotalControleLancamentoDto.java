package br.eti.webstuff.api.dto;

import java.math.BigDecimal;

public class TotalControleLancamentoDto {
	
	
	private Integer quantidadeLancamentos; 
	private Integer quantidadeRemessas; 
	private BigDecimal valorLancamentos;
	
	
	public TotalControleLancamentoDto() {
		
	}

	public Integer getQuantidadeLancamentos() {
		return quantidadeLancamentos;
	}


	public void setQuantidadeLancamentos(Integer quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
	}


	public Integer getQuantidadeRemessas() {
		return quantidadeRemessas;
	}


	public void setQuantidadeRemessas(Integer quantidadeRemessas) {
		this.quantidadeRemessas = quantidadeRemessas;
	}


	public BigDecimal getValorLancamentos() {
		return valorLancamentos;
	}


	public void setValorLancamentos(BigDecimal valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
	}


	@Override
	public String toString() {
		return "TotalControleLancamentoDto [quantidadeLancamentos=" + quantidadeLancamentos + ", quantidadeRemessas="
				+ quantidadeRemessas + ", valorLancamentos=" + valorLancamentos + "]";
	}

}
