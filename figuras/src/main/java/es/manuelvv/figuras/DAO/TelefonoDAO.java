package es.manuelvv.figuras.DAO;

import org.hibernate.Session;

import es.manuelvv.figuras.model.Telefono;

/**
 * Clase TelefonoDAO
 * 
 * Clase DAO para la tabla de teléfonos
 *
 * @author Manuel Vázquez
 * @version 1.0
 */
public class TelefonoDAO {

	/**
	 * Selección de un registro por su id
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param id - Identificador del registro
	 * @return El registro del id pasado por parametro
	 */
	public Telefono selectById(Session session, int id) {
		Telefono telefono = (Telefono) session.get(Telefono.class, id);
		return telefono;
	}
	
	/**
	 * Insercción de un registro
	 * @param num - session - Sessión de bbdd para realizar la operación
	 * @param telefono - Teléfono a insertar
	 */		
	public void insert(Session session, Telefono telefono){
		int id = (int) session.save(telefono);
		telefono.setId(id);
	}

	/**
	 * Actualización de un registro
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param telefono - Telefono a actualizar
	 */			
	public void update(Session session, Telefono telefono){
		session.merge(telefono);
	}
	
	/**
	 * Borrado de un registro
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param telefono - Telefono a borrar
	 */		
	public void delete(Session session, Telefono telefono){
		session.delete(telefono);
	}
}
