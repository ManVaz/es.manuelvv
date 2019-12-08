package es.manuelvv.figuras.DAO;

import org.hibernate.Session;

import es.manuelvv.figuras.model.Domicilio;

/**
 * Clase DomicilioDAO
 * 
 * Clase DAO para la tabla de domicilios
 *
 * @author Manuel Vázquez
 * @version 1.0
 */
public class DomicilioDAO {

	/**
	 * Selección de un registro por su id
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param id - Identificador del registro
	 * @return El registro del id pasado por parametro
	 */
	public Domicilio selectById(Session session, int id) {
		Domicilio domicilio = (Domicilio) session.get(Domicilio.class, id);
		return domicilio;
	}
	
	/**
	 * Insercción de un registro
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param domicilio - Domicilio a insertar
	 */	
	public void insert(Session session, Domicilio domicilio){
		int id = (int) session.save(domicilio);
		domicilio.setId(id);
	}

	/**
	 * Actualización de un registro
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param domicilio - Domicilio a actualizar
	 */	
	public void update(Session session, Domicilio domicilio){
		session.merge(domicilio);
	}
	
	/**
	 * Borrado de un registro
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param domicilio - Domicilio a borrar
	 */	
	public void delete(Session session, Domicilio domicilio){
		session.delete(domicilio);
	}
}
