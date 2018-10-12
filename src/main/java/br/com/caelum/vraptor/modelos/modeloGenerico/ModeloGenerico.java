package br.com.caelum.vraptor.modelos.modeloGenerico;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class ModeloGenerico implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "excluido")
	private Character excluido;

	@Column(name = "dt_cadastro")
	private LocalDateTime dtCadastro;

	public void setExcluido(Character excluido) {
		this.excluido = excluido;
	}

	public Character getExcluido() {
		return excluido;
	}

	public void setDtCadastro(LocalDateTime dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public LocalDateTime getDtCadastro() {
		return dtCadastro;
	}
}
