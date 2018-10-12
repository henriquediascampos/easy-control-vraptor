package br.com.caelum.vraptor.modelos.lancamentos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.caelum.vraptor.modelos.conta.Contas;
import br.com.caelum.vraptor.modelos.familia.Familia;
import br.com.caelum.vraptor.modelos.modeloGenerico.ModeloGenerico;
import br.com.caelum.vraptor.modelos.usuario.Usuario;

@Entity
@Table
public class Lancamentos extends ModeloGenerico {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "mysequence", sequenceName = "seq_lanc_id", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mysequence")
	@Column(name = "lanc_id")
	private Long id;

	@Column
	private String nome;

	private ETipoLacamento tipo;

	@JoinColumn
	@ManyToOne
	private Usuario usuario;

	@JoinColumn
	@ManyToOne
	private Familia familia;
	
	@JoinColumn
	@ManyToOne
	private Contas contas;

	// private Entrada entrada;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public ETipoLacamento getTipo() {
		return tipo;
	}

	public void setTipo(ETipoLacamento tipo) {
		this.tipo = tipo;
	}


}
