package es.manuelvv.figuras.DAO;

import org.hibernate.Session;

import es.manuelvv.figuras.model.Persona;

public class PersonaDAO {

	public Persona selectById(Session session, int id) {
		Persona persona = (Persona) session.get(Persona.class, id);
		return persona;
	}
	
	public void insert(Session session, Persona persona){
		int id = (int) session.save(persona);
		persona.setId(id);
	}

	public void update(Session session, Persona persona){
		session.merge(persona);
	}
	
	public void delete(Session session, Persona persona){
		session.delete(persona);
	}
}
