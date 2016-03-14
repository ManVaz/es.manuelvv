package es.manuelvv.framework.utils;

import javax.mail.internet.InternetAddress;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import es.manuelvv.framework.utils.Constantes;

/**
 * Clase ValidacionesUtils
 * 
 * Clase que contendra diversas utilidades
 *
 * @author Manuel Vázquez
 * @version 1.0
 */
public class ValidacionesUtils {

	/**
	 * Metodo que realiza la validación de un correo electronico
	 * @return - Indica si el email es correcto
	 * @param email - Email a validar
	 */
	public static boolean validarEmail(InternetAddress email){
	    
	    Pattern pattern = Pattern.compile(Constantes.PATTERN_EMAIL);
	    
        Matcher matcher = pattern.matcher(email.toString());
        return matcher.matches();
        
	}
	
	/**
	 * Metodo que realiza la validación de un correo electronico
	 * @return - Indica si el email es correcto
	 * @param email - Email a validar
	 */
	public static boolean validarEmail(String email){
		
		InternetAddress intAdd = new InternetAddress();
		return validarEmail(intAdd);
	}
	
}
