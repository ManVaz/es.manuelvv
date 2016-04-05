package es.manuelvv.figuras;

import static org.junit.Assert.*;

import org.junit.Test;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

import es.manuelvv.figuras.bbdd.hibernate.HibernateSession;
import es.manuelvv.figuras.usuario.DAO.UsuarioDAO;
import es.manuelvv.figuras.usuario.model.Usuario;
import es.manuelvv.framework.utils.EncriptacionMD5;
import es.manuelvv.figuras.persona.model.Persona;
import es.manuelvv.figuras.persona.DAO.PersonaDAO;

public class TestUsuario {

	@Test
	public void test() {
		
		SessionFactory sessionfactory = HibernateSession.getSessionfactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		
		Usuario usuario = new Usuario();
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		PersonaDAO personaDAO = new PersonaDAO();
		
		//Creamos la persona
		Persona persona = new Persona();
		persona.setCtl_usuario(1);
		persona.setCtl_estado(1);
		persona.setId_tipo_documento(1);
		persona.setNombre("Prueba");
		persona.setApellidos("Prueba");
		persona.setNum_documento("1001");
		
		//Inicializamos los datos del usuario
		usuario.setAlias("PRUEBA");
		usuario.setCtl_usuario(1);
		usuario.setEmail("prueba@gmail.com");
		usuario.setIntentos(0);
		usuario.setCtl_estado(0);
		
		//Encriptacion
		try{
			usuario.setPassword(EncriptacionMD5.encriptar("Vaz3525air"));
		} catch (Exception ex){
			fail("Error al encriptar passoword");
		}
				
		//Insert
		try{
			personaDAO.insert(session, persona);
			usuario.setPersona(persona);
			usuario.setId_persona(persona.getId());
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
		/*try{
			usuarioDAO.delete(session, usuario);
			personaDAO.delete(session, persona);
		} catch (Exception ex){
			fail("Error al borrar");
		}*/
		
		session.getTransaction().commit();
		session.close();
	}

	@Test
	public void testSelect() {
		
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		
		Usuario usuario = new Usuario();
		UsuarioDAO usuarioDAO = new UsuarioDAO();
				
		usuario.setId((long) 1);
		
		//Select
		try{
			usuario = usuarioDAO.selectById(session, usuario.getId());
		} catch (Exception ex){
			fail("Error al seleccionar");
		}
		
		session.getTransaction().commit();
		session.close();
	}
}
