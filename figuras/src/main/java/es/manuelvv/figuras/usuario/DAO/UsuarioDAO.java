package es.manuelvv.figuras.usuario.DAO;

import org.hibernate.Session;

import es.manuelvv.figuras.usuario.model.Usuario;

public class UsuarioDAO {

	public Usuario selectById(Session session, Long id) {
		Usuario usuario = (Usuario) session.get(Usuario.class, id);
		return usuario;
	}
	
	public void insert(Session session, Usuario usuario){
		Long id = (Long) session.save(usuario);
		usuario.setId(id);
	}

	public void update(Session session, Usuario usuario){
		session.merge(usuario);
	}
	
	public void delete(Session session, Usuario usuario){
		session.delete(usuario);
	}
	
}
