package es.manuelvv.figuras.DAO;

import org.hibernate.Session;

import es.manuelvv.figuras.model.TipoDocumento;

public class TipoDocumentoDAO {

	public TipoDocumento selectById(Session session, TipoDocumento tipo_documentos) {
		TipoDocumento tipo_documento = (TipoDocumento) session.get(TipoDocumento.class, tipo_documentos);
		return tipo_documento;
	}
	
	public void insert(Session session, TipoDocumento tipo_documento){
		int id = (int) session.save(tipo_documento);
		tipo_documento.setId(id);
	}

	public void update(Session session, TipoDocumento tipo_documento){
		session.merge(tipo_documento);
	}
	
	public void delete(Session session, TipoDocumento tipo_documento){
		session.delete(tipo_documento);
	}

}
