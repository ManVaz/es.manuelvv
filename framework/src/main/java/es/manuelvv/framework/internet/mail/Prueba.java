package es.manuelvv.framework.internet.mail;

import javax.mail.internet.InternetAddress;

public class Prueba {

	public static void main(String[] args){
		try{
			Mail m = new Mail("smtp.gmail.com", "manuelvv@gmail.com", "Vaz3525air");
			InternetAddress ia = new InternetAddress();
			ia.setAddress("manuelvv@gmail.com");
			m.setFrom(ia);
			ia.setAddress("manuelvv@gmail.com");
			m.setTo(ia);	
			
			m.setAsunto("Prueba");
			m.setTexto("Texto prueba");
			
			m.envio();
			
		}catch (Exception ex){
			//nada
		}
	}
	
	public Prueba() {

	}

}
