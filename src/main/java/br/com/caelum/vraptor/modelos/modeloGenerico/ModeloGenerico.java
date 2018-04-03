package br.com.caelum.vraptor.modelos.modeloGenerico;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

public class ModeloGenerico implements Serializable{

	private Character excluido;
	
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
