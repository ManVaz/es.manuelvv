package es.manuelvv.framework.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import es.manuelvv.framework.utils.Constantes;

/**
 * Clase EncriptacionMD5
 * 
 * Clase con la utilizad de encriptar un texto
 *
 * @author Manuel Vázquez
 * @version 1.0
 */
public class EncriptacionMD5 {

	/**
	 * Convirte el texto en hexadecimal
	 * @param digest Texto a pasar a hexadecimal
	 * @return Devuelve el texto pasada como parametro en hexadecimal
	 */
    private static String toHexadecimal(byte[] digest){
    	String hash = "";
    	for(byte aux : digest) {
    		int b = aux & 0xff;
    		
    		if (Integer.toHexString(b).length() == 1) hash += "0";
    			hash += Integer.toHexString(b);
    		}
    	return hash;
    }
    
	/**
	 * Encripta un texto dado en MD5
	 * @param palabra Texto a encriptar
	 * @return Devuelve el texto encriptado en MD5
	 */    
	public static String encriptar(String palabra) 
	throws NoSuchAlgorithmException {
		
		MessageDigest md = MessageDigest.getInstance(Constantes.MD5);
		
		md.reset();
		md.update(palabra.getBytes());
		byte[] digest = md.digest();
		
		return toHexadecimal(digest);
	
	}

}
