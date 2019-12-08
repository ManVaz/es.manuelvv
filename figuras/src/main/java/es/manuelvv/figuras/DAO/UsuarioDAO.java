package es.manuelvv.figuras.DAO;

import org.hibernate.Session;

import es.manuelvv.figuras.model.Usuario;

/**
 * Clase UsuarioDAO
 * 
 * Clase DAO para la tabla de usuarios
 *
 * @author Manuel Vázquez
 * @version 1.0
 */
public class UsuarioDAO {

	/**
	 * Selección de un registro por su id
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param id - Identificador del registro
	 * @return El registro del id pasado por parametro
	 */
	public Usuario selectById(Session session, int id) {
		Usuario usuario = (Usuario) session.get(Usuario.class, id);
		return usuario;
	}
	
	/**
	 * Insercción de un registro
	 * @param num - session - Sessión de bbdd para realizar la operación
	 * @param usuario - Usuario a insertar
	 */		
	public void insert(Session session, Usuario usuario){
		int id = (int) session.save(usuario);
		usuario.setId(id);
	}

	/**
	 * Actualización de un registro
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param usuario - Usuario a actualizar
	 */
	public void update(Session session, Usuario usuario){
		session.merge(usuario);
	}
	
	/**
	 * Borrado de un registro
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param usuario - Usuario a borrar
	 */	
	public void delete(Session session, Usuario usuario){
		session.delete(usuario);
	}
	
}
