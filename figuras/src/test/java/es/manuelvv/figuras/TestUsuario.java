package es.manuelvv.figuras;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

import es.manuelvv.figuras.DAO.*;
import es.manuelvv.figuras.model.*;
import es.manuelvv.framework.bbdd.hibernate.HibernateSession;
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
		usuario.setAlias("PRUEBA4");
		usuario.setCtl_usuario(1);
		usuario.setEmail("prueba4@gmail.com");
		usuario.setIntentos(0);
		usuario.setCtl_estado(0);
		
		//Creamos la persona
		Persona persona = new Persona();
		persona.setCtl_usuario(1);
		persona.setCtl_estado(1);
		persona.setId_tipo_documento(1);
		persona.setNombre("Prueba");
		persona.setApellidos("Prueba");
		persona.setNum_documento("1014");
		
		//Inicializamos los datos del domicilio
		Domicilio domicilio = new Domicilio();
		domicilio.setCalle("jj");
		domicilio.setCod_postal("28943");
		domicilio.setCtl_estado(1);
		domicilio.setCtl_usuario(1);
		domicilio.setId_pais(1);
		domicilio.setId_tipo_domicilio((long)1);
		domicilio.setLocalidad("dd");
		domicilio.setNumero(1);
		domicilio.setPiso("1");
		domicilio.setPuerta("1");
		persona.addDomicilio(domicilio);
		
		domicilio = new Domicilio();
		domicilio.setCalle("jj");
		domicilio.setCod_postal("28942");
		domicilio.setCtl_estado(1);
		domicilio.setCtl_usuario(1);
		domicilio.setId_pais(1);
		domicilio.setId_tipo_domicilio((long)1);
		domicilio.setLocalidad("dd");
		domicilio.setNumero(1);
		domicilio.setPiso("1");
		domicilio.setPuerta("1");
		persona.addDomicilio(domicilio);
		
		//Inicializamos los telefonos
		Telefono telefono = new Telefono();
		telefono.setCtl_estado(1);
		telefono.setTelefono("916074799");
		telefono.setCtl_usuario(1);
		persona.addTelefono(telefono);
		
		telefono = new Telefono();
		telefono.setCtl_estado(1);
		telefono.setTelefono("916074798");
		telefono.setCtl_usuario(1);
		persona.addTelefono(telefono);
		
		usuario.setPersona(persona);
		
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
			usuario.setEmail("prueba3@gmail.com");
			usuarioDAO.update(session, usuario);
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
			System.out.println(usuario.getPersona().getNombre());
		} catch (Exception ex){
			//fail("Error al seleccionar");
		}
		
		session.getTransaction().commit();
		session.close();
	}

	@Test
	public void testSelectPersona() {
		
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		
		Persona persona = new Persona();
		PersonaDAO personaDAO = new PersonaDAO();
		
		//Select
	    try{
			persona = personaDAO.selectById(session, (long)1);
		    for (Iterator<Domicilio> it = persona.getDomicilios().iterator(); it.hasNext(); ) {
		    	Domicilio d = it.next();
		        System.out.println(d.getLocalidad());
		    }
		    
		    for (Iterator<Telefono> it = persona.getTelefonos().iterator(); it.hasNext(); ) {
		    	Telefono f = it.next();
		        System.out.println(f.getTelefono());
		    }
		} catch (Exception ex){
			fail("Error al seleccionar");
		}
		
		session.getTransaction().commit();
		session.close();
	}
	
	@Test
	public void testSelectEstados() {
		
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		
		Estado estado = new Estado();
		estado.setId((long)1);
		estado.setIdioma("es");
		EstadoDAO estadoDAO = new EstadoDAO();
		
		estado = estadoDAO.selectById(session, estado);
		System.out.println(estado.getDesc_estado());
		
		session.getTransaction().commit();
		session.close();
		
	}
	
	@Test
	public void testSelectPaises() {
		
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		
		Pais pais = new Pais();
		PaisDAO paisDAO = new PaisDAO();
		
		pais = paisDAO.selectById(session, (long)1);
		System.out.println(pais.getDesc_pais());
		
		session.getTransaction().commit();
		session.close();
		
	}
	
	@Test
	public void testSelectTipoDocumento() {
		
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		
		TipoDocumento tipo_documento = new TipoDocumento();
		tipo_documento.setId((long)1);
		tipo_documento.setIdioma("es");
		TipoDocumentoDAO tipo_documentoDAO = new TipoDocumentoDAO();
		
		tipo_documento = tipo_documentoDAO.selectById(session, tipo_documento);
		System.out.println(tipo_documento.getDesc_tipo_documento());
		
		session.getTransaction().commit();
		session.close();
		
	}
	
	@Test
	public void testSelectTipoDomicilio() {
		
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		
		TipoDomicilio tipoDomicilio = new TipoDomicilio();
		tipoDomicilio.setId((long)1);
		tipoDomicilio.setIdioma("es");
		TipoDomicilioDAO tipoDomicilioDAO = new TipoDomicilioDAO();
		
		tipoDomicilio = tipoDomicilioDAO.selectById(session, tipoDomicilio);
		System.out.println(tipoDomicilio.getDesc_tipo_domicilio());
		
		session.getTransaction().commit();
		session.close();
		
	}
}
