package es.manuelvv.figuras.DAO;

import org.hibernate.Session;

import es.manuelvv.figuras.model.Pais;

public class PaisDAO {

	public Pais selectById(Session session, Long id) {
		Pais pais = (Pais) session.get(Pais.class, id);
		return pais;
	}
	
	public void insert(Session session, Pais pais){
		Long id = (Long) session.save(pais);
		pais.setId(id);
	}

	public void update(Session session, Pais pais){
		session.merge(pais);
	}
	
	public void delete(Session session, Pais pais){
		session.delete(pais);
	}

}