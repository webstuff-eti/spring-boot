package br.eti.webstuff.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="lancamento")
public class ControleLancamento implements Serializable {
	
	private static final long serialVersionUID = 9103144790219420931L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Integer numeroEvento; 
	private Integer quantidadeLancamentoRemessa;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar  dataEfetivaLancamento; 
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataLancamentoContaCorrenteCliente;  
	
	private String descricaoGrupoPagamento; 
	private String codigoIdentificadorUnico; 
	private String nomeBanco;  
	private String numeroRaizCNPJ; 
	private String numeroSufixoCNPJ; 
	private BigDecimal valorLancamentoRemessa; 
	
	@ManyToOne
	private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;
	
	
	public ControleLancamento() {	
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	public Calendar getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}


	public void setDataEfetivaLancamento(Calendar dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}


	public Calendar getDataLancamentoContaCorrenteCliente() {
		return dataLancamentoContaCorrenteCliente;
	}


	public void setDataLancamentoContaCorrenteCliente(Calendar dataLancamentoContaCorrenteCliente) {
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


	public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
		return lancamentoContaCorrenteCliente;
	}


	public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
	}


	@Override
	public String toString() {
		return "ControleLancamento [id=" + id + ", numeroEvento=" + numeroEvento + ", quantidadeLancamentoRemessa="
				+ quantidadeLancamentoRemessa + ", dataEfetivaLancamento=" + dataEfetivaLancamento
				+ ", dataLancamentoContaCorrenteCliente=" + dataLancamentoContaCorrenteCliente
				+ ", descricaoGrupoPagamento=" + descricaoGrupoPagamento + ", codigoIdentificadorUnico="
				+ codigoIdentificadorUnico + ", nomeBanco=" + nomeBanco + ", numeroRaizCNPJ=" + numeroRaizCNPJ
				+ ", numeroSufixoCNPJ=" + numeroSufixoCNPJ + ", valorLancamentoRemessa=" + valorLancamentoRemessa + "]";
	}

}
