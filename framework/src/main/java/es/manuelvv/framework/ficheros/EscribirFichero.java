package es.manuelvv.framework.ficheros;

import java.io.*;


/**
 * Clase EscribirFicheros
 * 
 * Clase con utilidades para escribir en un fichero
 * 
 * @author Manuel Vázquez
 * @version 1.0
 */
public class EscribirFichero {

	private FileWriter fichero;
	private PrintWriter pw;
	
	/**
	 * Constructor sin parametros
	 */
	public EscribirFichero() {}
	
	/**
	 * Constructor que recibe la ruta y nombre del fichero
	 * @param fichero - Ruta y nombre del fichero
	 * @throws IOException 
	 */
	public EscribirFichero(String fichero, boolean append) throws IOException {
		this.fichero = new FileWriter(fichero, append);
	}
	
	/**
	 * Constructor que recibe el fichero
	 * @param fichero - Clase File con el fichero
	 * @throws IOException 
	 */	
	public EscribirFichero(FileWriter fichero) throws FileNotFoundException {
		
		if (fichero != null) {
			this.fichero = fichero;
		} else {
			throw new FileNotFoundException("Clase File vacia");
		}
		
	}	
	
	/**
	 * Escribe una linea en el fichero 
	 * @param fichero - Clase File con el fichero
	 * @throws FileNotFoundException 
	 */		
	public void escribir(String linea) throws FileNotFoundException {
		
		if (fichero == null) {
			throw new FileNotFoundException("Clase File vacia");
		}
		
		pw = new PrintWriter(this.fichero);
		pw.println(linea);
				
	}
	
	/**
	 * Cierra el fichero
	 */		
	public void cerrar() {
		pw.close();
	}
	
}
