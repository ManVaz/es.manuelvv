package es.manuelvv.framework;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;
import es.manuelvv.framework.utils.ValidacionesUtils;

public class ValidacionesUtil {

	@Test
	public void test() {
		
		//Comprobar Par
		try{
			testPar();
		} catch (Exception ex){
			fail("Error al verificar par");
		}
		
		//Comprobar Bisiesto
		try{
			testBisiesto();
		} catch (Exception ex){
			fail("Error al verificar bisiesto");
		}		
	}

	@Test
	public void testPar() {
		short n = 3;
			
		if ((ValidacionesUtils.isPar(n) ||
			 ValidacionesUtils.isPar(3) ||
			 ValidacionesUtils.isPar(3.4f) || 
			 ValidacionesUtils.isPar(3.4)) == true) {
			
			fail("Error al seleccionar");
		
		}
		
		n = 2;
		if ((ValidacionesUtils.isPar(n) ||
			 ValidacionesUtils.isPar(2) ||
			 ValidacionesUtils.isPar(2.2f) || 
			 ValidacionesUtils.isPar(2.2)) == false) {
			
				fail("Error al seleccionar");
			
		}
	}
	
	@Test
	public void testBisiesto() {
		
		Calendar cal1 = new GregorianCalendar();
		Calendar cal2 = new GregorianCalendar();
		cal1.set(2008, 01, 01);
		cal2.set(2018, 01, 01);
		
		
		if (ValidacionesUtils.isBisiesto(2008) == false) {
			fail("Error al comprobar bisiesto");
		} else if (ValidacionesUtils.isBisiesto(2100) == true) {
			fail("Error al comprobar bisiesto");
		} else if (ValidacionesUtils.isBisiesto(cal1) == false) {
			fail("Error al comprobar bisiesto");
		} else if (ValidacionesUtils.isBisiesto(cal2) == true) {
			fail("Error al comprobar bisiesto");			
		}
		
	}
	
}
