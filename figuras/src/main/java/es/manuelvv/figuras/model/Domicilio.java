package es.manuelvv.figuras.model;

import java.util.Date;

public class Domicilio {

	private Long id;
	private Long id_tipo_domicilio;
	private String calle;
	private int numero;
	private String piso;
	private String puerta;
	private String resto;
	private String cod_postal;
	private String localidad;
	private int id_pais;
	private Date fec_alta;
	private Date fec_modif;
	private int ctl_usuario;
	private int ctl_estado;
	
	public Domicilio(){}
	
	public Domicilio(Long id, 
					 Long id_tipo_domicilio, 
					 String calle, 
					 int numero, 
					 String piso,
					 String puerta, 
					 String resto, 
					 String cod_postal, 
					 String localidad, 
					 int id_pais, 
					 Date fec_alta,
					 Date fec_modif, 
					 int ctl_usuario, 
					 int ctl_estado) {

		setId(id);
		setId_tipo_domicilio(id_tipo_domicilio);
		setCalle(calle);
		setNumero(numero);
		setPiso(piso);
		setPuerta(puerta);
		setResto(resto);
		setCod_postal(cod_postal);
		setLocalidad(localidad);
		setId_pais(id_pais);
		setFec_alta(fec_alta);
		setFec_modif(fec_modif);
		setCtl_usuario(ctl_usuario);
		setCtl_estado(ctl_estado);
		
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId_tipo_domicilio() {
		return id_tipo_domicilio;
	}
	
	public void setId_tipo_domicilio(Long id_tipo_domicilio) {
		this.id_tipo_domicilio = id_tipo_domicilio;
	}
	
	public String getCalle() {
		return calle;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getPiso() {
		return piso;
	}
	
	public void setPiso(String piso) {
		this.piso = piso;
	}
	
	public String getPuerta() {
		return puerta;
	}
	
	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}
	
	public String getResto() {
		return resto;
	}
	
	public void setResto(String resto) {
		this.resto = resto;
	}
	
	public String getCod_postal() {
		return cod_postal;
	}
	
	public void setCod_postal(String cod_postal) {
		this.cod_postal = cod_postal;
	}
	
	public String getLocalidad() {
		return localidad;
	}
	
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	public int getId_pais() {
		return id_pais;
	}
	
	public void setId_pais(int id_pais) {
		this.id_pais = id_pais;
	}
	
	public Date getFec_alta() {
		return fec_alta;
	}
	
	public void setFec_alta(Date fec_alta) {
		this.fec_alta = fec_alta;
	}
	
	public Date getFec_modif() {
		return fec_modif;
	}
	
	public void setFec_modif(Date fec_modif) {
		this.fec_modif = fec_modif;
	}
	
	public int getCtl_usuario() {
		return ctl_usuario;
	}
	
	public void setCtl_usuario(int ctl_usuario) {
		this.ctl_usuario = ctl_usuario;
	}
	
	public int getCtl_estado() {
		return ctl_estado;
	}
	
	public void setCtl_estado(int ctl_estado) {
		this.ctl_estado = ctl_estado;
	}

}
