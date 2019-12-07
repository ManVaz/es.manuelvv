package es.manuelvv.framework.utils.enumeracion;

/**
 * Enum Meses
 * 
 * Enumeración con los meses del año
 *
 * @author Manuel Vázquez
 * @version 1.0
 */
public enum Meses {

	ENERO(1, "Enero", 31), 
	FEBRERO(2, "Febrero", 28),
	MARZO(3, "Marzo", 31),
	ABRIL(4, "Abril", 30),
	MAYO(5, "Mayo", 31),
	JUNIO(6, "Junio", 30),
	JULIO(7, "Julio", 31),
	AGOSTO(8, "Agosto", 31),
	SEPTIEMBRE(9, "Septiembre", 30),
	OCTUBRE(10, "OCtubre", 31),
	NOVIEMBRE(11, "Noviembre", 30),
	DICIEMBRE(12, "Diciembre", 31);
	
	private int num;
	private String descripcion;
	private int dias;
	
	/**
	 * Constructor del enumerador
	 * @param num - Número del mes
	 * @param descripcion - Descripción del mes
	 * @param dias - Número de dias del mes
	 */	
	Meses(int num, String descripcion, int dias){
		this.num = num;
		this.descripcion = descripcion;
		this.dias = dias;
	}

	/**
	 * Metodo que devuelve el número del mes
	 * @return - Número del mes
	 */
	public int getNum() {
		return num;
	}

	/**
	 * Metodo que devuelve la descripcion del mes
	 * @return - Descripción del mes
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Metodo que devuelve el número de días del mes
	 * @return - Número de dias del mes
	 */
	public int getDias() {
		return dias;
	}

}
