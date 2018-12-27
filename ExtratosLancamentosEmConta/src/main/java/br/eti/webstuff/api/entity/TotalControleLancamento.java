package br.eti.webstuff.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="total_controle_lancamento")
public class TotalControleLancamento implements Serializable {
	

	private static final long serialVersionUID = 5589570350022033897L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Integer quantidadeLancamentos; 
	private Integer quantidadeRemessas; 
	private BigDecimal valorLancamentos;
	
	public TotalControleLancamento() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		return "TotalControleLancamento [id=" + id + ", quantidadeLancamentos=" + quantidadeLancamentos
				+ ", quantidadeRemessas=" + quantidadeRemessas + ", valorLancamentos=" + valorLancamentos + "]";
	}
	

}
