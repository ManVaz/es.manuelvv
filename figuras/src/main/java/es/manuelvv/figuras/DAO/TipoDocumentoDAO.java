package es.manuelvv.figuras.DAO;

import org.hibernate.Session;

import es.manuelvv.figuras.model.TipoDocumento;

/**
 * Clase TipoDocumentoDAO
 * 
 * Clase DAO para la tabla de tipos de documento
 *
 * @author Manuel Vázquez
 * @version 1.0
 */
public class TipoDocumentoDAO {

	/**
	 * Selección de un registro por su id
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param id - Identificador del registro
	 * @return El registro del id pasado por parametro
	 */
	public TipoDocumento selectById(Session session, TipoDocumento tipo_documentos) {
		TipoDocumento tipo_documento = (TipoDocumento) session.get(TipoDocumento.class, tipo_documentos);
		return tipo_documento;
	}
	
	/**
	 * Insercción de un registro
	 * @param num - session - Sessión de bbdd para realizar la operación
	 * @param tipoDocumento - Tipo de documento a insertar
	 */		
	public void insert(Session session, TipoDocumento tipoDocumento){
		int id = (int) session.save(tipoDocumento);
		tipoDocumento.setId(id);
	}

	/**
	 * Actualización de un registro
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param tipoDocumento - Tipo de documento a actualizar
	 */		
	public void update(Session session, TipoDocumento tipoDocumento){
		session.merge(tipoDocumento);
	}
	
	/**
	 * Borrado de un registro
	 * @param session - Sessión de bbdd para realizar la operación
	 * @param tipoDocumento - Tipo de documento a borrar
	 */	
	public void delete(Session session, TipoDocumento tipoDocumento){
		session.delete(tipoDocumento);
	}

}
