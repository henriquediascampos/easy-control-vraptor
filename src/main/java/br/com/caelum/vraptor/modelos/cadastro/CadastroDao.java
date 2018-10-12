package br.com.caelum.vraptor.modelos.cadastro;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.generic.GenericDao;

@SuppressWarnings("serial")
@RequestScoped
public class CadastroDao extends GenericDao<Cadastro> implements Serializable{
	
	@SuppressWarnings("unchecked")
	public List<Cadastro> busca() {
		Criteria criteria = session.createCriteria(Cadastro.class, "cada");
		return criteria.list();
	}
	
	public Cadastro buscaPorIdi(Long id) {
		Criteria criteria = session.createCriteria(Cadastro.class, "cada");
		criteria.add(Restrictions.idEq(id));
		return (Cadastro) criteria.uniqueResult();
	}
	
	public Cadastro buscarPorNome(String nome) {
		Criteria criteria = session.createCriteria(Cadastro.class, "cada");
		criteria.add(Restrictions.eq("cada.nome", nome));
		return (Cadastro) criteria.uniqueResult();
	}
}
