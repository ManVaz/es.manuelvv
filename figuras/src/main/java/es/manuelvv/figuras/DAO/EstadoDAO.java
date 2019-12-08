package es.manuelvv.figuras.DAO;

import org.hibernate.Session;
import es.manuelvv.figuras.model.Estado;

/**
 * Clase EstadoDAO
 * 
 * Clase DAO para la tabla de estados
 *
 * @author Manuel Vázquez
 * @version 1.0
 */
public class EstadoDAO {

	/**
	 * Selección de un registro por su id
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param id - Identificador del registro
	 * @return El registro del id pasado por parametro
	 */
	public Estado selectById(Session session, Estado estados) {
		Estado estado = (Estado) session.get(Estado.class, estados);
		return estado;
	}
	
	/**
	 * Insercción de un registro
	 * @param num - session - Sessión de bbdd para realizar la operación
	 * @param estado - Estado a insertar
	 */		
	public void insert(Session session, Estado estado){
		int id = (int) session.save(estado);
		estado.setId(id);
	}

	/**
	 * Actualización de un registro
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param estado - Estado a actualizar
	 */	
	public void update(Session session, Estado estado){
		session.merge(estado);
	}
	
	/**
	 * Borrado de un registro
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param estado - Estado a borrar
	 */		
	public void delete(Session session, Estado estado){
		session.delete(estado);
	}
}

