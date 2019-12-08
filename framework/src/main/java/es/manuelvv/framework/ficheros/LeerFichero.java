package es.manuelvv.framework.ficheros;

import java.io.*;

/**
 * Clase LeerFichero
 * 
 * Clase con utilidades para leer en un fichero
 * 
 * @author Manuel Vázquez
 * @version 1.0
 */
public class LeerFichero {

	private FileReader fichero;
	private BufferedReader br;
	
	/**
	 * Constructor sin parametros
	 */
	public LeerFichero() {}
	
	/**
	 * Constructor que recibe la ruta y nombre del fichero
	 * @param fichero - Ruta y nombre del fichero
	 * @throws IOException 
	 */
	public LeerFichero(String fichero) throws IOException {
		
		this.fichero = new FileReader(fichero);
		this.br = new BufferedReader(this.fichero);
		
	}	
	
	/**
	 * Constructor que recibe el fichero
	 * @param fichero - Clase FileReader con el fichero
	 */	
	public LeerFichero(FileReader fichero) {
		
		this.br = new BufferedReader(this.fichero);

	}		
	
	/**
	 * Lee una linea del fichero 
	 * @param fichero - Clase File con el fichero
	 * @throws IOException 
	 */		
	public String leer() throws IOException {
		
		if (fichero == null) {
			throw new FileNotFoundException("Clase FileReader vacia");
		}
		
		return br.readLine();
						
	}
	
	/**
	 * Cierra el fichero
	 * @throws IOException 
	 */		
	public void cerrar() throws IOException {
		fichero.close();
	}
	
}
