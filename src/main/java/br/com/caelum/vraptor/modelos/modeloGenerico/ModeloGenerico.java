package br.com.caelum.vraptor.modelos.modeloGenerico;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class ModeloGenerico implements Serializable{

	@Column(name="excluido")
	private Character excluido;
	
	@Column(name="dt_cadastro")
	private Date dtCadastro;

	public void setExcluido(Character excluido){
		this.excluido = excluido;
	}
	
	public Character getExcluido(){
		return excluido;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public Date getDtCadastro(){
		return dtCadastro;
	}
}
