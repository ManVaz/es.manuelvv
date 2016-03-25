package es.manuelvv.framework;

import static org.junit.Assert.*;
import org.junit.Test;
import es.manuelvv.framework.utils.EncriptacionMD5;

/**
 * Unit test for simple App.
 */
public class TestEncriptacion {

	@Test
	public void test() {
		try{
			String enc;
			enc = EncriptacionMD5.encriptar("password");
			if (!enc.isEmpty()){
				System.out.println(enc);
				assertTrue(true);
			}
		}catch (Exception ex){
			fail("Error al encriptar");
		}
	}

}
