package es.manuelvv.framework.internet.mail;

import java.util.ArrayList;
import java.util.Properties;

import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;

import es.manuelvv.framework.utils.Constantes;
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
	private ArrayList<InternetAddress> bbc = new ArrayList<InternetAddress>();
	private String asunto;
	private String host;
	private String usuario;
	private String password;
	private int puerto;
	
	private Multipart multipart = new MimeMultipart();
	
	private Properties props;
	private Session session;
	private MimeMessage message;
	
	/**
	 * Valida si existe toda la información necesaria para enviar el correo
	 * @return true/false si la validación es correcta
	 */
	private boolean validarEmail(){
		
		if (asunto.isEmpty() ||
			host.isEmpty() ||
			usuario.isEmpty() ||
			password.isEmpty() ||
			puerto == 0 ||
			from == null ||
			to.isEmpty()){
			return false;
		}
		return true;
	}
	
	/**
	 * Constructor sin parámetros, se inicializa la session y el mensaje
	 * @param host Servidor de correo electronico
	 * @param puerto Puerto del servidor de correo electronico
	 * @param usuario Usuario del servidor
	 * @param password Password del servidor
	 */
	public Mail(String host, int puerto, String usuario, String password){
		
		//Se asigna el usuario y el password
		setHost(host);
		setUsuario(usuario);
		setPassword(password);
		setPuerto(puerto);
		
		//Se crea el objeto de autentificación
		Autentificador aut = new Autentificador(getUsuario(), getPassword());
		
	    //Se crea la session 
		props = System.getProperties();
		props.put(Constantes.JM_MAIL_SMTP, getHost());
		props.put(Constantes.JM_SOCK_PORT, puerto);
		props.put(Constantes.JM_SOCK_CLAS, Constantes.JM_SOCK_SSL);
		props.put(Constantes.JM_MAIL_AUTH, Constantes.TRUE);
		props.put(Constantes.JM_MAIL_SMTP, puerto);
		
		session = Session.getDefaultInstance(props, aut); 
		
		//Se crea el mensaje
		message = new MimeMessage(session);
		
	}

	/**
	 * Envio de los correos electronicos
	 * @throws MessagingException Excepción al enviar un correo electronico
	 */
	public void envio() 
	throws MessagingException{
		
		if (!validarEmail()){
			throw new MessagingException("Faltan datos para enviar el email");//Sustituir muulltidioma
		}
		
		message.saveChanges(); 
		
		Transport transport = session.getTransport("smtps");
		transport.connect(getHost(), getUsuario(), getPassword());
		transport.sendMessage(message, message.getAllRecipients());
		transport.close();

	}
	
	/**
	 * Añade un fichero al correo electronico
	 * @param fichero a añadir
	 * @throws MessagingException Excepción al adjuntar un fichero
	 */
	public void setFichero(String fichero) 
	throws MessagingException{
		DataSource source = new FileDataSource(fichero);
		
		BodyPart messageBodyPart = new MimeBodyPart();
		messageBodyPart.setDataHandler(new DataHandler(source));
		messageBodyPart.setFileName(fichero);
		multipart.addBodyPart(messageBodyPart);
		
		message.setContent(multipart);
	}
	
	/**
	 * Asigna un asuento en formato html
	 * @param html Html del correo electronico
	 * @throws MessagingException Excepción al añadir un texto html
	 */
	public void setHtml(String html) 
	throws MessagingException{
		BodyPart messageBodyPart = new MimeBodyPart();
		messageBodyPart.setContent(html, Constantes.TXT_HTML);
		multipart.addBodyPart(messageBodyPart);
		
		message.setContent(multipart);
	}

	/**
	 * Asigna un texto plano para el email
	 * @param texto Texto plano de un email
	 * @throws MessagingException Excepción al añadir un texto simple
	 */
	public void setTexto(String texto) 
	throws MessagingException{
		BodyPart messageBodyPart = new MimeBodyPart();
		messageBodyPart.setText(texto);
		multipart.addBodyPart(messageBodyPart);
		
		message.setContent(multipart);
	}
	
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
	 * @throws MessagingException Excepción al añadir el origen 
	 */
	public void setFrom(InternetAddress from) 
	throws MessagingException {
		
		this.from = from;
		message.setFrom(from);
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
	 * @throws MessagingException Excepción al añadir un destinatario
	 */
	public void setTo(InternetAddress to) 
	throws MessagingException{
		
		//Validamos la dirección
		if (ValidacionesUtils.validarEmail(to)){
			this.to.add(to);
			message.addRecipient(Message.RecipientType.TO, to);
		}else{
			throw new AddressException();
		}
	}
	
	/**
	 * Añade varios destinatarios a la lista de destinatarios
	 * @param to Lista de email de destinatarios para añadir 
	 * @throws MessagingException Excepción al añadir varios destinatarios
	 */
	public void setTo(InternetAddress to[])
	throws MessagingException{
		
		for (int i=0; i<to.length; i++){
			if (ValidacionesUtils.validarEmail(to[i])){
				this.to.add(to[i]);
				message.addRecipient(Message.RecipientType.TO, to[i]);
			}else{
				throw new AddressException();
			}
		}
		
	}

	/**
	 * Retorna la lista de destinatarios en copia oculta
	 * @return bbc 
	 */
	public ArrayList<InternetAddress> getBcc() {
		return bbc;
	}

	/**
	 * Añade un destinatario a la lista de copias
	 * @param bbc Email de destinatario en copia oculta para añadir al ArrayList
	 * @throws MessagingException Excepción al asingar varios emaail en copia
	 */
	public void setBbc(InternetAddress bbc) 
	throws MessagingException{
		
		//Validamos la dirección
		if (ValidacionesUtils.validarEmail(bbc)){
			this.bbc.add(bbc);
			message.addRecipient(Message.RecipientType.BCC, bbc);
		}else{
			throw new AddressException();
		}
	}
	
	/**
	 * Añade varios destinatarios en copia oculta a la lista de destinatarios
	 * @param bbc Lista de email en copia oculata para añadir 
	 * @throws MessagingException Excepción al aañadir varios correos en copia oculta
	 */
	public void setBbc(InternetAddress bbc[])
	throws MessagingException{
		
		for (int i=0; i<bbc.length; i++){
			if (ValidacionesUtils.validarEmail(bbc[i])){
				this.bbc.add(bbc[i]);
				message.addRecipient(Message.RecipientType.BCC, bbc[i]);
			}else{
				throw new AddressException();
			}
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
	 * @throws MessagingException Excepción al añadir correo en copia
	 */
	public void setCc(InternetAddress cc) 
	throws MessagingException{

		//Validamos la dirección
		if (ValidacionesUtils.validarEmail(cc)){
			this.cc.add(cc);
			message.addRecipient(Message.RecipientType.CC, cc);
		}else{
			throw new AddressException();		
		}
	}
	
	/**
	 * Añade varios destinatarios en copia a la lista de destinatarios
	 * @param cc Lista de email en copia para añadir 
	 * @throws MessagingException Excepción al añadir varios correos en copia
	 */
	public void setCc(InternetAddress cc[])
	throws MessagingException{
		
		for (int i=0; i<cc.length; i++){
			if (ValidacionesUtils.validarEmail(cc[i])){
				this.bbc.add(cc[i]);
				message.addRecipient(Message.RecipientType.CC, cc[i]);
			}else{
				throw new AddressException();
			}
		}
		
	}

	/**
	 * Retorna el asunto
	 * @return asunto
	 */
	public String getAsunto() {
		return asunto;
	}

	/**
	 * Anade el asunto al correo
	 * @param asunto Asunto del correo
	 * @throws MessagingException Excepción al asignar asunto
	 */
	public void setAsunto(String asunto) 
	throws MessagingException {
		this.asunto = asunto;
		message.setSubject(asunto);
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

	/**
	 * Retorna el password del usuario del correo
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Retorna el puerto del servidor de correo
	 * @return puerto
	 */
	public int getPuerto() {
		return puerto;
	}

	/**
	 * Añade el puerto del servidor de correo
	 * @param puerto Puerto del servidor
	 */
	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}
}
