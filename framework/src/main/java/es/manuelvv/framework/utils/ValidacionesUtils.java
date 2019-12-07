package es.manuelvv.framework.utils;

import javax.mail.internet.InternetAddress;

import java.util.*;
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
	
	/**
	 * Metodo que comprueba si un valor es par
	 * @return - Indica si el numero pasado es par
	 * @param numero - Numero a evaluar
	 */	
	public static boolean isPar(short numero) {
		return isPar((double)numero);
	}	
	
	/**
	 * Metodo que comprueba si un valor es par
	 * @return - Indica si el numero pasado es par
	 * @param numero - Numero a evaluar
	 */	
	public static boolean isPar(int numero) {
		return isPar((double)numero);
	}
	
	/**
	 * Metodo que comprueba si un valor es par
	 * @return - Indica si el numero pasado es par
	 * @param numero - Numero a evaluar
	 */	
	public static boolean isPar(float numero) {
		return isPar((double)numero);
	}
	
	/**
	 * Metodo que comprueba si un valor es par
	 * @return - Indica si el numero pasado es par
	 * @param numero - Numero a evaluar
	 */	
	public static boolean isPar(double numero) {
		double res = numero % 2;
		if (res == 0) {
			return true;
		} else {
			return false;
		}
	}	
	
	/**
	 * Metodo que comprueba si un año es bisiesto
	 * @return - Indica si el año pasado es bisiesto
	 * @param año - Año a comprobar
	 */		
	public static boolean isBisiesto(int ano) {
		
		if ((ano % 4) == 0 && (ano % 100) != 0) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Metodo que comprueba si un año es bisiesto
	 * @return - Indica si el año pasado es bisiesto
	 * @param año - Año a comprobar
	 */		
	public static boolean isBisiesto(Calendar fecha) {
					
		if ((fecha.get(Calendar.YEAR) % 4) == 0 && (fecha.get(Calendar.YEAR) % 100) != 0) {
			return true;
		}
		
		return false;
	}
				
}
