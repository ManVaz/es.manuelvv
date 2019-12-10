package es.manuelvv.framework.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Clase UtilsProperties
 * 
 * Conjunto de utilidades para tratar los ficheros properties
 * 
 * @author Manuel Vázquez
 * @version 1.0
 */
public final class UtilsProperties {

	/**
	 * Leer un fichero properties dado
	 * @param fichero - Fichero de properties
	 * @return Properties - Retorna un objeto con las diferentes propiedades existentes en el fichero
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static Properties leer(String fichero) throws FileNotFoundException, IOException {
		
		Properties p = new Properties();
		p.load(new FileReader(fichero));

		return p;
		
	}
	
	/**
	 * Leer un fichero properties dado y devuelve el valor de una de las propiedades
	 * @param fichero - Fichero de properties
	 * @param propiedad - Propiedad a devolver su valor
	 * @return Valor de la propiedad en el fichero
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static String leer(String fichero, String propiedad) throws FileNotFoundException, IOException {
		
		Properties p = new Properties();
		p.load(new FileReader(fichero));

		return p.getProperty(propiedad);
		
	}	
}
