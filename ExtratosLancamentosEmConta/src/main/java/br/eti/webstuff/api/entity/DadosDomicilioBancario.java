package br.eti.webstuff.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="domicilio_bancario")
public class DadosDomicilioBancario implements Serializable {

	private static final long serialVersionUID = 5940030083185375222L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="codigo_banco", nullable=false)
	private Integer codigoBanco;	
	
	@Column(name="numero_agencia", nullable=false)
	private Integer numeroAgencia;
	
	@Column(name="numero_conta_corrente", nullable=false)
	private String numeroContaCorrente;
	
	public DadosDomicilioBancario() {	
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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

	@Override
	public String toString() {
		return "DadosDomicilioBancario [id=" + id + ", codigoBanco=" + codigoBanco + ", numeroAgencia=" + numeroAgencia
				+ ", numeroContaCorrente=" + numeroContaCorrente + "]";
	}
	
	
	
}
