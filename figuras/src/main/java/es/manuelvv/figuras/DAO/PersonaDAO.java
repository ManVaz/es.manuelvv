package es.manuelvv.figuras.DAO;

import org.hibernate.Session;

import es.manuelvv.figuras.model.Persona;

/**
 * Clase PersonaDAO
 * 
 * Clase DAO para la tabla de personas
 *
 * @author Manuel Vázquez
 * @version 1.0
 */
public class PersonaDAO {

	/**
	 * Selección de un registro por su id
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param id - Identificador del registro
	 * @return El registro del id pasado por parametro
	 */
	public Persona selectById(Session session, int id) {
		Persona persona = (Persona) session.get(Persona.class, id);
		return persona;
	}
	
	/**
	 * Insercción de un registro
	 * @param num - session - Sessión de bbdd para realizar la operación
	 * @param persona - Persona a insertar
	 */		
	public void insert(Session session, Persona persona){
		int id = (int) session.save(persona);
		persona.setId(id);
	}

	/**
	 * Actualización de un registro
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param persona - Persona a actualizar
	 */			
	public void update(Session session, Persona persona){
		session.merge(persona);
	}
	
	/**
	 * Borrado de un registro
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param persona - Persona a borrar
	 */	
	public void delete(Session session, Persona persona){
		session.delete(persona);
	}
}
