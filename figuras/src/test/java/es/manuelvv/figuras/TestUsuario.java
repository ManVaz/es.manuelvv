package es.manuelvv.figuras;

import static org.junit.Assert.*;

import org.junit.Test;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

import es.manuelvv.framework.bbdd.hibernate.HibernateSession;
import es.manuelvv.figuras.usuario.DAO.UsuarioDAO;
import es.manuelvv.figuras.usuario.model.Usuario;
import es.manuelvv.framework.utils.EncriptacionMD5;

public class TestUsuario {

	@Test
	public void test() {
		
		SessionFactory sessionfactory = HibernateSession.getSessionfactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		
		Usuario usuario = new Usuario();
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		//Inicializamos los datos del usuario
		usuario.setAlias("PRUEBA");
		usuario.setCtl_usuario(1);
		usuario.setEmail("prueba@gmail.com");
		usuario.setIntentos(0);
		
		//Encriptacion
		try{
			usuario.setPassword(EncriptacionMD5.encriptar("Vaz3525air"));
		} catch (Exception ex){
			fail("Error al encriptar passoword");
		}
				
		//Insert
		try{
			usuarioDAO.insert(session, usuario);
		} catch (Exception ex){
			fail("Error al insertar");
		}
		
		//Update
		try{
			usuario.setEmail("prueba2@gmail.com");
			usuarioDAO.insert(session, usuario);
		} catch (Exception ex){
			fail("Error al actualiza");
		}
		
		//Select
		try{
			usuario = usuarioDAO.selectById(session, usuario.getId());
		} catch (Exception ex){
			fail("Error al seleccionar");
		}
		
		//Delete
		try{
			usuarioDAO.delete(session, usuario);
		} catch (Exception ex){
			fail("Error al borrar");
		}
		
		session.getTransaction().commit();
		session.close();
	}

}
