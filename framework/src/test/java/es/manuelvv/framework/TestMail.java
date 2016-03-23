package es.manuelvv.framework;

import javax.mail.internet.InternetAddress;

import es.manuelvv.framework.internet.mail.Mail;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TestMail 
    extends TestCase
{
	
	/**
	 * @param args Argumentos
	 */
	public static void main (String[] args){
		junit.textui.TestRunner.run(suite());
	} 

    /**
     * @return the suite of tests being tested
     */
    public static Test suite(){
        return new TestSuite(TestMail.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testMail(){
    	
		try{
			Mail m = new Mail("smtp.gmail.com", 465, "manuelvv", "Vaz3525air");
			InternetAddress ia = new InternetAddress();
			ia.setAddress("manuelvv@gmail.com");
			m.setFrom(ia);
			ia.setAddress("manuelvv@gmail.com");
			m.setTo(ia);	
			
			m.setAsunto("Prueba");
			m.setHtml("<h1>PRUEBA</h1>");
			m.setFichero("C:/API JavaMail.pdf");
			m.envio();
			assertTrue(true);
			
		}catch (Exception ex){
			fail("Error al enviar el correo electronico");
		}
        
    }
}
