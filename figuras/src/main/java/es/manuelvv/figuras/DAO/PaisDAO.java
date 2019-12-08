package es.manuelvv.figuras.DAO;

import org.hibernate.Session;

import es.manuelvv.figuras.model.Pais;

/**
 * Clase PaisDAO
 * 
 * Clase DAO para la tabla de paises
 *
 * @author Manuel Vázquez
 * @version 1.0
 */
public class PaisDAO {

	/**
	 * Selección de un registro por su id
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param id - Identificador del registro
	 * @return El registro del id pasado por parametro
	 */
	public Pais selectById(Session session, int id) {
		Pais pais = (Pais) session.get(Pais.class, id);
		return pais;
	}
	
	/**
	 * Insercción de un registro
	 * @param num - session - Sessión de bbdd para realizar la operación
	 * @param pais - Pais a insertar
	 */		
	public void insert(Session session, Pais pais){
		int id = (int) session.save(pais);
		pais.setId(id);
	}

	/**
	 * Actualización de un registro
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param pais - Pais a actualizar
	 */		
	public void update(Session session, Pais pais){
		session.merge(pais);
	}
	
	/**
	 * Borrado de un registro
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param pais - Pais a borrar
	 */	
	public void delete(Session session, Pais pais){
		session.delete(pais);
	}

}
