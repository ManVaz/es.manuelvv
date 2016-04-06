package es.manuelvv.figuras.bbdd.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateSession {

	private static final SessionFactory sessionFactory = buildSessionFactory();
	private static Session session;
	
	public static SessionFactory buildSessionFactory(){
		Configuration configuration = new Configuration();
		configuration.configure("/es/manuelvv/figuras/bbdd/hibernate/hibernate.cfg.xml");
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		return sessionFactory;
	}

	public static Session getSession(){
		if (session == null || !session.isOpen()){
			session = null;
			session = sessionFactory.openSession();
		}
		return session;
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}

	
}
