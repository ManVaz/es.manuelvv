package es.manuelvv.figuras.DAO;

import org.hibernate.Session;
import es.manuelvv.figuras.model.Estado;

public class EstadoDAO {

	public Estado selectById(Session session, Estado estadoS) {
		Estado estado = (Estado) session.get(Estado.class, estadoS);
		return estado;
	}
	
	public void insert(Session session, Estado estado){
		Long id = (Long) session.save(estado);
		estado.setId(id);
	}

	public void update(Session session, Estado estado){
		session.merge(estado);
	}
	
	public void delete(Session session, Estado estado){
		session.delete(estado);
	}
}

