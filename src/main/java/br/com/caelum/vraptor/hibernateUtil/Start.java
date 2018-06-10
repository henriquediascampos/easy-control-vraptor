package br.com.caelum.vraptor.hibernateUtil;

import javax.enterprise.event.Observes;

import org.hibernate.Session;

import br.com.caelum.vraptor.events.VRaptorInitialized;

public class Start {

	public void start(@Observes VRaptorInitialized vr) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSessoes().close();
	}
}
