package br.eti.webstuff.api.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "lancamento_conta_corrente_cliente")
public class LancamentoContaCorrenteCliente implements Serializable {

	private static final long serialVersionUID = 2020193207532311126L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long numeroRemessaBanco;
	private String nomeSituacaoRemessa;
	private String nomeTipoOperacao;

	@ManyToOne
	private DadosDomicilioBancario dadosDomicilioBancario;

	public LancamentoContaCorrenteCliente() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}

	public void setNumeroRemessaBanco(Long numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}

	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}

	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}

	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}

	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}

	public DadosDomicilioBancario getDadosDomicilioBancario() {
		return dadosDomicilioBancario;
	}

	public void setDadosDomicilioBancario(DadosDomicilioBancario dadosDomicilioBancario) {
		this.dadosDomicilioBancario = dadosDomicilioBancario;
	}

	@Override
	public String toString() {
		return "LancamentoContaCorrenteCliente [id=" + id + ", numeroRemessaBanco=" + numeroRemessaBanco
				+ ", nomeSituacaoRemessa=" + nomeSituacaoRemessa + ", nomeTipoOperacao=" + nomeTipoOperacao + "]";
	}

}
