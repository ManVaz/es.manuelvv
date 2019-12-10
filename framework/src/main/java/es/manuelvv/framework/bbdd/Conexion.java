package es.manuelvv.framework.bbdd;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

import es.manuelvv.framework.utils.UtilsProperties;

/**
 * Clase Conexion
 * 
 * Permite extablecer y cerrar la conexión de bbdd a partir del fichero de properties
 * 
 * @author Manuel Vázquez
 * @version 1.0
 */
public class Conexion {

	private static final String FICHERO_CON_BBDDD = "C:\\Users\\manue\\git\\es.manuelvv\\framework\\src\\main\\java\\es\\manuelvv\\framework\\bbdd\\bbdd.properties";
	private static final String URL_BBDD = "URL_BBDD"; 
	private static final String USER_BBDD = "USER_BBDD"; 
	private static final String PASS_BBDD = "PASS_BBDD"; 
	
	/**
	 * Permite abrir una conexión de bbdd según el fichero properties
	 * @return Devuelve una conexión
	 * @throws SQLException
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static Connection getConnection() throws SQLException, FileNotFoundException, IOException {
		
		Properties p = UtilsProperties.leer(FICHERO_CON_BBDDD);			
		return DriverManager.getConnection(p.getProperty(URL_BBDD), p.getProperty(USER_BBDD), p.getProperty(PASS_BBDD));
		
	}
	
	/**
	 * Cierra un ResultSet
	 * @param rs - ResultSet
	 * @throws SQLException
	 */
	public static void close(ResultSet rs) throws SQLException {
		rs.close();
	}
	
	/**
	 * Cierra un PreparedStatement
	 * @param ps - PreparedStatement
	 * @throws SQLException
	 */	
	public static void close(PreparedStatement ps) throws SQLException {
		ps.close();
	}	
	
	/**
	 * Cierra una conexión
	 * @param cn - Connection
	 * @throws SQLException
	 */		
	public static void close(Connection cn) throws SQLException {
		cn.close();
	}
	
	
	/**
	 * Cierra la conexión, el PreparedStatement y el ResultSet pasados por parametros
	 * @param rs - ResultSet
	 * @param ps - PreparedStatement
	 * @param cn - Connection
	 * @throws SQLException
	 */
	public static void close(ResultSet rs, PreparedStatement ps, Connection cn) throws SQLException {
		rs.close();
		ps.close();
		cn.close();
	}
	
}
