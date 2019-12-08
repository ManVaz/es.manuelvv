package es.manuelvv.framework.bbdd.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Clase HibernateSession
 * 
 * Se establece una sesión de bbdd a partir del fichero de hibernate de configuración
 * 
 * @author Manuel Vázquez
 * @version 1.0
 */
public class HibernateSession {

	private static final SessionFactory sessionFactory = buildSessionFactory();
	private static Session session;
	
	/**
	 * Se genera un sessionFactory con la configuración establecida en el fichero de configuración de hibernate
	 * @return Devuelve un SessionFactory
	 */
	public static SessionFactory buildSessionFactory(){
		Configuration configuration = new Configuration();
		configuration.configure("/es/manuelvv/framework/bbdd/hibernate/hibernate.cfg.xml");
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		return sessionFactory;
		
	}

	/**
	 * Recupera una sesión
	 * @return Retorna una sesión
	 */
	public static Session getSession(){
		if (session == null || !session.isOpen()){
			session = null;
			session = sessionFactory.openSession();
		}
		return session;
	}

	/**
	 * Recupera una sessionFactory
	 * @return Devuelve un SessionFactory
	 */
	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}

	
}
