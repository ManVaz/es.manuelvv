package es.manuelvv.figuras.DAO;

import org.hibernate.*;
import org.hibernate.criterion.*;

import java.security.NoSuchAlgorithmException;
import java.util.List;

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
	 * Comprueba si el usuario y passoword existen
	 * @param session
	 * @param alias
	 * @param password
	 * @return Verdadero o falso según exista el usuario o no
	 */
	public boolean existUsuario(Session session, String alias, String password) {
		
		List<?> resultado;
		
		Criteria criteria = session.createCriteria(Usuario.class);
		
		//Filtros
		Criterion qAlias = Restrictions.ge("alias", alias);
		Criterion qPassword = Restrictions.ge("password", password);
				
		LogicalExpression condicion = Restrictions.and(qAlias, qPassword);
		criteria.add(condicion);
		
		//Agregacion
		criteria.setProjection(Projections.rowCount());
						
		resultado = criteria.list();
		if (resultado.isEmpty()) {
			return false;
		} 
		else if ((long) resultado.get(0) == 1L) {
			return true;
		}
		else {
			return false;
		}
				
	}	
	
	/**
	 * Comprueba si el usuario existe
	 * @param session
	 * @param alias
	 * @param password
	 * @return Verdadero o falso según exista el usuario o no
	 */
	public boolean existUsuario(Session session, String alias) {
		
		List<?> resultado;
		Criteria criteria = session.createCriteria(Usuario.class);
		
		//Filtros
		SimpleExpression condicion = Restrictions.ge("alias", alias);
		criteria.add(condicion);
		
		//Agregacion
		criteria.setProjection(Projections.rowCount());
		
		resultado = criteria.list();
		if (resultado.isEmpty()) {
			return false;
		} 
		else if ((long) resultado.get(0) == 1L) {
			return true;
		}
		else {
			return false;
		}
		
	}		
	
	/**
	 * Metodo que con un alias y password retorna un usuario
	 * @param session
	 * @param alias
	 * @param password
	 * @return El usuario obtenido en la buqueda
	 * @throws NoSuchAlgorithmException 
	 */
	public Usuario selectByUsuarioPass(Session session, String alias, String password) throws NoSuchAlgorithmException {
		
		List<?> resultado;
		Criteria criteria = session.createCriteria(Usuario.class);
		
		//Filtros
		Criterion qAlias = Restrictions.eq("alias", alias);
		Criterion qPassword = Restrictions.eq("password", password);
				
		LogicalExpression condicion = Restrictions.and(qAlias, qPassword);
		
		criteria.add(condicion);
		criteria.setFetchMode("persona", FetchMode.JOIN);
		criteria.setFetchMode("persona.domicilios", FetchMode.JOIN);
		criteria.setFetchMode("persona.telefonos", FetchMode.JOIN);
		
		resultado = criteria.list();
		if (resultado.isEmpty()) {
			throw new RuntimeException("No existe usuario");
		} else {
			return (Usuario) resultado.get(0);
		}
		
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
	
};
