package es.manuelvv.framework;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.GregorianCalendar;

import org.junit.Test;
import es.manuelvv.framework.ficheros.*;

public class TestFicheros {

	private static final String FICHERO_TEST = "\\C:\\srv\\wEclipse\\test\\escribir.txt";	

	@Test
	public void testEscribir() {
		
		try {
			EscribirFichero ef = new EscribirFichero(FICHERO_TEST, true);
			GregorianCalendar ca = new GregorianCalendar();
			ef.escribir(ca.getTime().toString() + " - " + "Texto prueba");
			ef.cerrar();
		} catch (IOException e) {
			fail("Error al escribir");
		}
				
	}
	
	@Test
	public void testLeer() {
		
		try {
			String linea;
			LeerFichero lf = new LeerFichero(FICHERO_TEST);
			linea = lf.leer();
			System.out.println(linea);
			linea = lf.leer();
			System.out.println(linea);
			lf.cerrar();
		} catch (IOException e) {
			fail("Error al leer");
		}
	}
	
}
