package es.manuelvv.figuras.DAO;

import org.hibernate.Session;

import es.manuelvv.figuras.model.TipoDomicilio;

public class TipoDomicilioDAO {

	public TipoDomicilio selectById(Session session, TipoDomicilio tipoDomicilios) {
		TipoDomicilio tipoDomicilio = (TipoDomicilio) session.get(TipoDomicilio.class, tipoDomicilios);
		return tipoDomicilio;
	}
	
	public void insert(Session session, TipoDomicilio tipoDomicilio){
		int id = (int) session.save(tipoDomicilio);
		tipoDomicilio.setId(id);
	}

	public void update(Session session, TipoDomicilio tipoDomicilio){
		session.merge(tipoDomicilio);
	}
	
	public void delete(Session session, TipoDomicilio tipoDomicilio){
		session.delete(tipoDomicilio);
	}


}
