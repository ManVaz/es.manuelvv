package es.manuelvv.framework.utils.enumeracion;

/**
 * Enum Dias
 * 
 * Enumeración con los días de la semana
 *
 * @author Manuel Vázquez
 * @version 1.0
 */
public enum Dias {

	LUNES(1,"Lunes"), 
	MARTES(2,"Martes"),
	MIERCOLES(3,"Miercoles"),
	JUEVES(4,"Jueves"),
	VIERNES(5,"Viernes"),
	SABADO(6,"Sabado"),
	DOMINGO(7,"Domingo");
	
	private int num;
	private String descripcion;
		
	/**
	 * Constructor del enumerador
	 * @param num - Número del día
	 * @param descripcion - Descripción del día
	 */
	Dias(int num, String descripcion){
		this.num = num;
		this.descripcion = descripcion;
	}

	/**
	 * Metodo que devuelve el número del día de la semana
	 * @return - Día de la semana
	 */
	public int getNum() {
		return this.num;
	}

	/**
	 * Metodo que devuelve la descripción del día
	 * @return - Descripción del día
	 */	
	public String getDescripcion() {
		return this.descripcion;
	}
	
}
