package br.com.caelum.vraptor.hibernateUtil;


import java.util.Set;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.reflections.Reflections;


@ApplicationScoped
public class HibernateUtil {
	
	private static SessionFactory fabricaDeSessoes = criarFabricaDeSessoes();

	@Produces
	@RequestScoped
	public Session getCurrentSession() {
		Session session = fabricaDeSessoes.openSession();
		return session;
	}
	
	// @RequestScoped
	//@Produces
	public static SessionFactory getFabricaDeSessoes() {
		return fabricaDeSessoes;
	}

//	@PostConstruct    tornar o metodo void, deixar a anotação postcontruct
//e em vez de retorno ter um variavel recebendo
	private static SessionFactory criarFabricaDeSessoes() {
		try {
			Configuration configuracao = new Configuration().configure();
			
			Reflections r = new Reflections("br.com.caelum.vraptor.modelos.*");			
			Set<Class<?>> classes = r.getTypesAnnotatedWith(Entity.class);
			for(Class<?> clazz : classes) {
				configuracao.addAnnotatedClass(clazz);
				System.out.println("=============/////////-------////////===========");
				System.out.println("classe pegas:   -- " + clazz);
			}
		
			//============///teste\\\===========\\
			StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder().configure();
			configuracao.configure("hibernate.cfg.xml");
			serviceRegistryBuilder.applySettings(configuracao.getProperties());
			ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
			
			System.out.println(""
				+"__________                            _________            _____             ______	\n"
				+"___  ____/_____ ____________  __      __  ____/______________  /________________  /	\n"
				+"__  __/  _  __ `/_  ___/_  / / /_______  /    _  __ \\_  __ \\  __/_  ___/  __ \\_  / \n"
				+"_  /___  / /_/ /_(__  )_  /_/ /_/_____/ /___  / /_/ /  / / / /_ _  /   / /_/ /  /  	\n"
				+"/_____/  \\__,_/ /____/ _\\__, /        \\____/  \\____//_/ /_/\\__/ /_/    \\____//_/\n"
				+"					   /____/                                                       	\n"
					+"");
			return configuracao.buildSessionFactory(serviceRegistry);
			/*ServiceRegistry registro = new StandardServiceRegistryBuilder()
					.applySettings(configuracao.getProperties()).build();
			
			SessionFactory fabrica = configuracao.buildSessionFactory(registro);
			return fabrica;*/
		} catch (Throwable ex) {
			System.err.println("=======================================================================");
			System.err.println("=======================================================================");
			System.err.println("A fábrica de sessões não pode ser criada." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

/*	public void start(@Observes VRaptorInitialized vr) {
		Session sessao = getFabricaDeSessoes().openSession();
		sessao.close();
		getFabricaDeSessoes().close();
	}*/
}
