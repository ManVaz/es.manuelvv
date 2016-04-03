package es.manuelvv.framework;

import static org.junit.Assert.*;
import org.junit.Test;
import es.manuelvv.framework.internet.mail.Mail;
import javax.mail.internet.InternetAddress;

public class TestMail {

	@Test
	public void test() {

		try{
			Mail m = new Mail("smtp.gmail.com", 465, "manuelvv", "Vaz3525air");
			InternetAddress ia = new InternetAddress();
			ia.setAddress("manuelvv@gmail.com");
			m.setFrom(ia);
			ia.setAddress("manuelvv@gmail.com");
			m.setTo(ia);	
			
			m.setAsunto("Prueba");
			m.setHtml("<h1>PRUEBA</h1>");
			m.setFichero("C:/srv/eclipse/eclipse.ini");
			m.envio();
			assertTrue(true);
			
		}catch (Exception ex){
			ex.printStackTrace();
			fail("Error al enviar el correo electronico");
		}
	        
	}

}
