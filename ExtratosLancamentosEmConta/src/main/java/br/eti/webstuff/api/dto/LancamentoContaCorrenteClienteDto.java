package br.eti.webstuff.api.dto;

public class LancamentoContaCorrenteClienteDto {

	private Long numeroRemessaBanco;
	private String nomeSituacaoRemessa;
	private String nomeTipoOperacao;

	private DadosDomicilioBancarioDto dadosDomicilioBancario;

	public LancamentoContaCorrenteClienteDto() {

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

	public DadosDomicilioBancarioDto getDadosDomicilioBancario() {
		return dadosDomicilioBancario;
	}

	public void setDadosDomicilioBancario(DadosDomicilioBancarioDto dadosDomicilioBancario) {
		this.dadosDomicilioBancario = dadosDomicilioBancario;
	}

	@Override
	public String toString() {
		return "LancamentoContaCorrenteClienteDto [numeroRemessaBanco=" + numeroRemessaBanco + ", nomeSituacaoRemessa="
				+ nomeSituacaoRemessa + ", nomeTipoOperacao=" + nomeTipoOperacao + ", dadosDomicilioBancario="
				+ dadosDomicilioBancario + "]";
	}
	
}
