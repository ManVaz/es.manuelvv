package es.manuelvv.figuras.DAO;

import org.hibernate.Session;

import es.manuelvv.figuras.model.TipoDomicilio;

/**
 * Clase TipoDomicilioDAO
 * 
 * Clase DAO para la tabla de tipos de domicilio
 *
 * @author Manuel Vázquez
 * @version 1.0
 */
public class TipoDomicilioDAO {

	/**
	 * Selección de un registro por su id
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param id - Identificador del registro
	 * @return El registro del id pasado por parametro
	 */
	public TipoDomicilio selectById(Session session, TipoDomicilio tipoDomicilios) {
		TipoDomicilio tipoDomicilio = (TipoDomicilio) session.get(TipoDomicilio.class, tipoDomicilios);
		return tipoDomicilio;
	}
	
	/**
	 * Insercción de un registro
	 * @param num - session - Sessión de bbdd para realizar la operación
	 * @param tipoDomicilio - Tipo de domicilio a insertar
	 */		
	public void insert(Session session, TipoDomicilio tipoDomicilio){
		int id = (int) session.save(tipoDomicilio);
		tipoDomicilio.setId(id);
	}

	/**
	 * Actualización de un registro
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param tipoDomicilio - Tipo de domicilio a actualizar
	 */	
	public void update(Session session, TipoDomicilio tipoDomicilio){
		session.merge(tipoDomicilio);
	}
	
	/**
	 * Borrado de un registro
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param tipoDomicilio - Tipo de domicilio a borrar
	 */	
	public void delete(Session session, TipoDomicilio tipoDomicilio){
		session.delete(tipoDomicilio);
	}


}
