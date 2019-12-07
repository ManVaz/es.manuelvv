package es.manuelvv.figuras.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="tr_domicilios")
public class Domicilio 
implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_domicilio")
	private int id;
	
	@Column(name = "id_tipo_domicilio")
	private int idTipoDomicilio;
	
	@Column(name = "calle")
	private String calle;
	
	@Column(name = "numero")
	private int numero;
	
	@Column(name = "piso")
	private String piso;
	
	@Column(name = "puerta")
	private String puerta;
	
	@Column(name = "resto")
	private String resto;
	
	@Column(name = "cod_postal")
	private String codPostal;
	
	@Column(name = "localidad")
	private String localidad;
	
	@Column(name = "id_pais")
	private int idPais;
	
	@Column(name = "fec_alta")
	private Date fecAlta;
	
	@Column(name = "fec_modif")
	private Date fecModif;
	
	@Column(name = "ctl_usuario")
	private int ctlUsuario;
	
	@Column(name = "ctl_estado")
	private int ctlEstado;
	
	public Domicilio(){}
	
	public Domicilio(int id, 
					 int idTipoDomicilio, 
					 String calle, 
					 int numero, 
					 String piso,
					 String puerta, 
					 String resto, 
					 String codPostal, 
					 String localidad, 
					 int idPais, 
					 Date fecAlta,
					 Date fecModif, 
					 int ctlUsuario, 
					 int ctlEstado) {

		setId(id);
		setIdTipoDomicilio(idTipoDomicilio);
		setCalle(calle);
		setNumero(numero);
		setPiso(piso);
		setPuerta(puerta);
		setResto(resto);
		setCodPostal(codPostal);
		setLocalidad(localidad);
		setIdPais(idPais);
		setFecAlta(fecAlta);
		setFecModif(fecModif);
		setCtlUsuario(ctlUsuario);
		setCtlEstado(ctlEstado);
		
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdTipoDomicilio() {
		return idTipoDomicilio;
	}
	
	public void setIdTipoDomicilio(int idTipoDomicilio) {
		this.idTipoDomicilio = idTipoDomicilio;
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
	
	public String getCodPostal() {
		return codPostal;
	}
	
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}
	
	public String getLocalidad() {
		return localidad;
	}
	
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	public int getIdPais() {
		return idPais;
	}
	
	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}
	
	public Date getFecAlta() {
		return fecAlta;
	}
	
	public void setFecAlta(Date fecAlta) {
		this.fecAlta = fecAlta;
	}
	
	public Date getFecModif() {
		return fecModif;
	}
	
	public void setFecModif(Date fecModif) {
		this.fecModif = fecModif;
	}
	
	public int getCtlUsuario() {
		return ctlUsuario;
	}
	
	public void setCtlUsuario(int ctlUsuario) {
		this.ctlUsuario = ctlUsuario;
	}
	
	public int getCtlEstado() {
		return ctlEstado;
	}
	
	public void setCtlEstado(int ctlEstado) {
		this.ctlEstado = ctlEstado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
