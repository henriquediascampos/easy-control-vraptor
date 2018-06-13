package br.com.caelum.vraptor.modelos.login;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.generic.GenericDao;

@SuppressWarnings("serial")
@RequestScoped
public class LoginDao extends GenericDao<Login> implements Serializable{
	
	@SuppressWarnings("unchecked")
	public List<Login> busca() {
		Criteria criteria = session.createCriteria(Login.class, "pais");
		return criteria.list();
	}
	
	public Login buscaPorId(Long id) {
		Criteria criteria = session.createCriteria(Login.class, "pais");
		criteria.add(Restrictions.idEq(id));
		return (Login) criteria.uniqueResult();
	}
	
	public Login buscarPorNome(String nome) {
		Criteria criteria = session.createCriteria(Login.class, "pais");
		criteria.add(Restrictions.eq("pais.nome", nome));
		return (Login) criteria.uniqueResult();
	}
}
