package br.com.caelum.vraptor.modelos.conta;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.caelum.vraptor.modelos.modeloGenerico.ModeloGenerico;

@SuppressWarnings("serial")
@Entity
@Table(name = "contas")
public class Contas extends ModeloGenerico{
	@Id
	@SequenceGenerator(name = "mysequence", sequenceName = "seq_cont_id", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mysequence")
	@Column(name="cont_id")
	private Long id;

	@Column
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
