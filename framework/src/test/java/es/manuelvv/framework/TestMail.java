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
			
			Mail email = new Mail("smtp.strato.com",25,"webmaster@manuelvv.es","b4woVgX5t&8N$8k");
			email.setAsunto("Prueba");
			email.setTo(new InternetAddress("manuelvv@gmail.com"));
			email.setFrom(new InternetAddress("webmaster@manuelvv.es"));
			email.setTexto("Prueba");
			email.envio();			
		}catch (Exception ex){
			System.out.println(ex.getMessage());
			fail("Error al enviar mail");			
		}
	}

}
