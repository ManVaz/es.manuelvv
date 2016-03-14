package es.manuelvv.framework.internet.mail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * Clase Autentificador
 * 
 * Clase para realizar la autentificación en un servidor de correo.
 * 
 * @author Manuel Vázquez
 * @version 1.0
 */
public class Autentificador extends Authenticator {

	private String usuario;
	private String password;
	
	/**
	 * Constructor.
	 */
	public Autentificador() {
		super();
	}
	
	/**
	 * Retorna un objeto PasswordAuthentication para realizar la autentificación en el servidor
	 * @return PasswordAuthentication 
	 */
	public PasswordAuthentication getPasswordAutentificador() {
		return new PasswordAuthentication(this.usuario, this.password);
	}

	/**
	 * Usuario del servidor
	 * @param usuario Usuario
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * Password del servidor
	 * @param password Passwword
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
