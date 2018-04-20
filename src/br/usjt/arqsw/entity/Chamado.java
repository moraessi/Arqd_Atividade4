package br.usjt.arqsw.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
/**
 * 
 * @author Gabriela Vieira - 81610253 - SIN3AN-MCA1
 */


@Entity
public class Chamado implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String ABERTO = null;
	public static final String FECHADO = null;
		
	@Column(name="id_chamado")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Size(max=100, min=10)
	private String descricao;
	
	
	@NotNull
	private String status;
	
	@NotNull
	private Date dt_abertura;
	
	@Null
	private Date dt_fechamento;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="id_fila")
	private Fila fila;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDt_abertura() {
		return dt_abertura;
	}

	public void setDt_abertura(Date dt_abertura) {
		this.dt_abertura =dt_abertura;
	}

	public Date getDt_fechamento() {
		return dt_fechamento;
	}

	public void setDt_fechamento(Date dt_fechamento) {
		this.dt_fechamento = dt_fechamento;
	}

	public Fila getFila() {
		return fila;
	}

	public void setFila(Fila fila) {
		this.fila = fila;
	}

}
