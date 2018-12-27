package br.eti.webstuff.api.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

//TODO: Pode ser que essa classe seja necessária apenas no DTO

@Entity
@Table(name = "lista_controle_lancamento")
public class ListaControleLancamento implements Serializable {

	private static final long serialVersionUID = 8006896853260894401L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer indice;
	private Integer tamanhoPagina;
	private Integer totalElementos;

	@ManyToMany
	List<ControleLancamento> controles;

	public ListaControleLancamento() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Integer getTotalElementos() {
		return totalElementos;
	}

	public void setTotalElementos(Integer totalElementos) {
		this.totalElementos = totalElementos;
	}

	public List<ControleLancamento> getControles() {
		return controles;
	}

	public void setControles(List<ControleLancamento> controles) {
		this.controles = controles;
	}

	@Override
	public String toString() {
		return "ListaControleLancamento [id=" + id + ", indice=" + indice + ", tamanhoPagina=" + tamanhoPagina
				+ ", totalElementos=" + totalElementos + "]";
	}

}
