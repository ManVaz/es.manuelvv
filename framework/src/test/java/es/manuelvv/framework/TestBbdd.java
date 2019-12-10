package es.manuelvv.framework;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

import es.manuelvv.framework.bbdd.Conexion;


public class TestBbdd {

	@Test
	public void testCon() {
		
		try{		
			Connection con = Conexion.getConnection();
			PreparedStatement ps = con.prepareStatement("Select nombre from tr_personas");
			
			ResultSet rs = ps.executeQuery();
			rs.next();
			System.out.print(rs.getString("nombre"));
			
			Conexion.close(rs, ps, con);
					
			assertTrue(true);
			
		}catch (Exception ex){
			System.out.print(ex.fillInStackTrace());
			fail("Error al encriptar");
		}
	}
	
}
