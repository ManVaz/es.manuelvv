/**
 * 
 */
package es.manuelvv.framework;

import static org.junit.Assert.*;
import org.junit.Test;
import es.manuelvv.framework.internet.mail.Mail;
import javax.mail.internet.InternetAddress;

/**
 * Unit test for simple App.
 */
public class TestMail {

	@Test
	public void test() {
		try{
			
			Mail email = new Mail("smtp.gmail.com",587,"manuelvv@gmail.com","OwK1j90Nq6Vx");
			email.setAsunto("Prueba");
			email.setTo(new InternetAddress("manuelvvusa@gmail.com"));
			email.setFrom(new InternetAddress("manuelvv@gmail.com"));
			email.setTexto("Prueba");
			email.envio();			
		}catch (Exception ex){
			System.out.println(ex.getMessage());
			fail("Error al enviar mail");			
		}
	}

}
