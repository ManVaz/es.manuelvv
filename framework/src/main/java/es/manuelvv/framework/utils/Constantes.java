package es.manuelvv.framework.utils;

/**
 * Clase Constantes
 * 
 * Clase con las diferenes constantes
 *
 * @author Manuel Vázquez
 * @version 1.0
 */
public final class Constantes {

	//Patron para la validación de email
    public static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
    									 "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    //Contantes para email
    public static final String JM_MAIL_SMTP = "mail.smtp.host";
    public static final String JM_SOCK_PORT = "mail.smtp.socketFactory.port";
    public static final String JM_SOCK_CLAS = "mail.smtp.socketFactory.class";
    public static final String JM_SOCK_SSL = "javax.net.ssl.SSLSocketFactory";
    public static final String JM_MAIL_AUTH = "mail.smtp.auth";
    
    //Tipos
    public static final String TXT_HTML = "text/html";
    
    //Constantes genericas
    public static final String TRUE = "true";
    
    //Tipos encriptación
    public static final String MD5 =  "MD5"; 
    
}
