package es.manuelvv.framework.internet.mail;

import java.util.ArrayList;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.AddressException;
import es.manuelvv.framework.utils.ValidacionesUtils;

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
	 * @param from Email que envia el correo electronico
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
	 * @param to Email de destinatario para añadir al ArrayList
	 */
	public void setTo(InternetAddress to) 
	throws AddressException{
		
		//Validamos la dirección
		if (ValidacionesUtils.validarEmail(to)){
			this.to.add(to);
		}else{
			throw new AddressException();
		}
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
	 * @param cc Email para copia a anadir al ArrayList
	 */
	public void setCc(InternetAddress cc) 
	throws AddressException{

		//Validamos la dirección
		if (ValidacionesUtils.validarEmail(cc)){
			this.cc.add(cc);
		}else{
			throw new AddressException();		
		}
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
	 * @param host Host que enviara el correo
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
	 * @param usuario Usuario del servidor
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	/**
	 * Añade el password del servidor de correo
	 * @param password Password del servidor
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
}
