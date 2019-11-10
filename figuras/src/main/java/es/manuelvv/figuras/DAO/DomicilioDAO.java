package es.manuelvv.figuras.DAO;

import org.hibernate.Session;

import es.manuelvv.figuras.model.Domicilio;

public class DomicilioDAO {

	public Domicilio selectById(Session session, int id) {
		Domicilio domicilio = (Domicilio) session.get(Domicilio.class, id);
		return domicilio;
	}
	
	public void insert(Session session, Domicilio domicilio){
		int id = (int) session.save(domicilio);
		domicilio.setId(id);
	}

	public void update(Session session, Domicilio domicilio){
		session.merge(domicilio);
	}
	
	public void delete(Session session, Domicilio domicilio){
		session.delete(domicilio);
	}
}
