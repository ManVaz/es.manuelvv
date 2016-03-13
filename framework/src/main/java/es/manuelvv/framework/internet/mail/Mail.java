package es.manuelvv.framework.internet.mail;

import java.util.ArrayList;
import javax.mail.internet.InternetAddress;

/**
 * Clase Mail
 * 
 * Clase principal para la preparación y envio de correos
 *
 * @author Manuel Vázquez
 * @version 1.0
 */
public class Mail {

	//Variables privadas
	private InternetAddress from;
	private ArrayList<InternetAddress> to = new ArrayList<InternetAddress>();
	private ArrayList<InternetAddress> cc = new ArrayList<InternetAddress>();
	private String host;
	private String usuario;
	private String password;
	

	/**
	 * Constructor sin parámetros
	 */
	public Mail() {}

	/**
	 * Retorna el emisor del correo
	 * @return from 
	 */
	public InternetAddress getFrom() {
		return from;
	}
	
	/**
	 * Añade el emisor del correo
	 * @param from 
	 */
	public void setFrom(InternetAddress from) {
		this.from = from;
	}

	/**
	 * Retorna la lista de destinatarios
	 * @return to 
	 */
	public ArrayList<InternetAddress> getTo() {
		return to;
	}

	/**
	 * Añade un destinatario a la lista de destinatarios
	 * @param to 
	 */
	public void setTo(InternetAddress to) {
		this.to.add(to);
	}

	/**
	 * Retorna la lista de email en copia
	 * @return cc 
	 */
	public ArrayList<InternetAddress> getCc() {
		return cc;
	}

	/**
	 * Añade un destinatario como copia
	 * @param cc 
	 */
	public void setCc(InternetAddress cc) {
		this.cc.add(cc);
	}

	/**
	 * Retorna el servidor añadido
	 * @return host 
	 */
	public String getHost() {
		return host;
	}

	/**
	 * Anade el servidor de correo
	 * @param host 
	 */
	public void setHost(String host) {
		this.host = host;
	}

	/**
	 * Retorna el usuario de correo
	 * @return usuario 
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * Añade el usuario del servidor de corre
	 * @param usuarioo
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	/**
	 * Añade el password del servidor de correo
	 * @param password 
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
}
