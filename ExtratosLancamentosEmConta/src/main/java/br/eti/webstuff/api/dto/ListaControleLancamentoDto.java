package br.eti.webstuff.api.dto;

import java.util.List;

public class ListaControleLancamentoDto {

	private Integer indice;
	private Integer tamanhoPagina;
	private Integer totalElements;

	private List<ControleLancamentoDto> lancamentos;

	public ListaControleLancamentoDto() {

	}

	public Integer getIndice() {
		return indice;
	}

	public void setIndice(Integer indice) {
		this.indice = indice;
	}

	public Integer getTamanhoPagina() {
		return tamanhoPagina;
	}

	public void setTamanhoPagina(Integer tamanhoPagina) {
		this.tamanhoPagina = tamanhoPagina;
	}

	public Integer getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}

	public List<ControleLancamentoDto> getLancamentos() {
		return lancamentos;
	}

	public void setLancamentos(List<ControleLancamentoDto> lancamentos) {
		this.lancamentos = lancamentos;
	}

	@Override
	public String toString() {
		return "ListaControleLancamentoDto [indice=" + indice + ", tamanhoPagina=" + tamanhoPagina + ", totalElements="
				+ totalElements + "]";
	}

}
