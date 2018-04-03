package br.com.caelum.vraptor.modelos.usuario;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.caelum.vraptor.modelos.modeloGenerico.ModeloGenerico;
import br.com.caelum.vraptor.modelos.pessoa.Pessoa;

@Entity
@Table(name = "usuario")
public class Usuario extends ModeloGenerico{
	@Id
	@SequenceGenerator(name = "mysequence", sequenceName = "seq_usua_id", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mysequence")
	@Column(name="usua_id")
	private Long id;
	
	@Column
	private String usuario;
	
	
	private String senha;
	
	
	private String email;

	@OneToOne
	@JoinColumn(referencedColumnName="pess_id", name="pess_id")
	private Pessoa pessoa;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
