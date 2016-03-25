package es.manuelvv.framework.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import es.manuelvv.framework.utils.Constantes;

public class EncriptacionMD5 {

    private static String toHexadecimal(byte[] digest){
    	String hash = "";
    	for(byte aux : digest) {
    		int b = aux & 0xff;
    		
    		if (Integer.toHexString(b).length() == 1) hash += "0";
    			hash += Integer.toHexString(b);
    		}
    	return hash;
    }
    
	public static String encriptar(String palabra) 
	throws NoSuchAlgorithmException {
		
		MessageDigest md = MessageDigest.getInstance(Constantes.MD5);
		
		md.reset();
		md.update(palabra.getBytes());
		byte[] digest = md.digest();
		
		return toHexadecimal(digest);
	
	}
	
	

}
