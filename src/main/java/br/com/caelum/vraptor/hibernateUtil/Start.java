package br.com.caelum.vraptor.hibernateUtil;

import javax.enterprise.event.Observes;

import org.hibernate.Session;

import br.com.caelum.vraptor.events.VRaptorInitialized;

public class Start {

	public void start(@Observes VRaptorInitialized vr) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSessoes().close();
		System.out.println(""
				+"__________                            _________            _____             ______	 \n"
				+"___  ____/_____ ____________  __      __  ____/______________  /________________  /	 \n"
				+"__  __/  _  __ `/_  ___/_  / / /_______  /    _  __ \\_  __ \\  __/_  ___/  __ \\_  /  \n"
				+"_  /___  / /_/ /_(__  )_  /_/ /_/_____/ /___  / /_/ /  / / / /_ _  /   / /_/ /  /  	 \n"
				+"/_____/  \\__,_/ /____/ _\\__, /        \\____/  \\____//_/ /_/\\__/ /_/    \\____//_/ \n"
				+"					   /____/                                                       	 \n"
					+"");
	}
}
