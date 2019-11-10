package es.manuelvv.figuras.DAO;

import org.hibernate.Session;

import es.manuelvv.figuras.model.Usuario;

public class UsuarioDAO {

	public Usuario selectById(Session session, int id) {
		Usuario usuario = (Usuario) session.get(Usuario.class, id);
		return usuario;
	}
	
	public void insert(Session session, Usuario usuario){
		int id = (int) session.save(usuario);
		usuario.setId(id);
	}

	public void update(Session session, Usuario usuario){
		session.merge(usuario);
	}
	
	public void delete(Session session, Usuario usuario){
		session.delete(usuario);
	}
	
}
