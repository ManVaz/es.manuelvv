package es.manuelvv.figuras.DAO;

import org.hibernate.Session;

import es.manuelvv.figuras.model.Telefono;

public class TelefonoDAO {

	public Telefono selectById(Session session, int id) {
		Telefono telefono = (Telefono) session.get(Telefono.class, id);
		return telefono;
	}
	
	public void insert(Session session, Telefono telefono){
		int id = (int) session.save(telefono);
		telefono.setId(id);
	}

	public void update(Session session, Telefono telefono){
		session.merge(telefono);
	}
	
	public void delete(Session session, Telefono telefono){
		session.delete(telefono);
	}
}
