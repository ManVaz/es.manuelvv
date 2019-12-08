package es.manuelvv.figuras.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Clase Domicilio
 * 
 * Clase para la gestión de un domicilio
 *
 * @author Manuel Vázquez
 * @version 1.0
 */
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
	
	/**
	 * Constructor vacio
	 */		
	public Domicilio(){}
	

	/**
	 * Constructor con todos los parametros
	 * @param id
	 * @param idTipoDomicilio
	 * @param calle
	 * @param numero
	 * @param piso
	 * @param puerta
	 * @param resto
	 * @param codPostal
	 * @param localidad
	 * @param idPais
	 * @param fecAlta
	 * @param fecModif
	 * @param ctlUsuario
	 * @param ctlEstado
	 */
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

	/**
	 * @return id
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return idTipoDomicilio
	 */	
	public int getIdTipoDomicilio() {
		return this.idTipoDomicilio;
	}
	
	/**
	 * @param idTipoDomicilio
	 */
	public void setIdTipoDomicilio(int idTipoDomicilio) {
		this.idTipoDomicilio = idTipoDomicilio;
	}
	
	/**
	 * @return calle
	 */	
	public String getCalle() {
		return this.calle;
	}
	
	/**
	 * @param calle
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	/**
	 * @return numero
	 */	
	public int getNumero() {
		return this.numero;
	}
	
	/**
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	/**
	 * @return piso
	 */	
	public String getPiso() {
		return this.piso;
	}
	
	/**
	 * @param piso
	 */
	public void setPiso(String piso) {
		this.piso = piso;
	}
	
	/**
	 * @return puerta
	 */	
	public String getPuerta() {
		return this.puerta;
	}
	
	/**
	 * @param puerta
	 */
	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}
	
	/**
	 * @return resto
	 */	
	public String getResto() {
		return this.resto;
	}
	
	/**
	 * @param resto
	 */
	public void setResto(String resto) {
		this.resto = resto;
	}
	
	/**
	 * @return codPostal
	 */	
	public String getCodPostal() {
		return this.codPostal;
	}
	
	/**
	 * @param codPostal
	 */
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}
	
	/**
	 * @return localidad
	 */	
	public String getLocalidad() {
		return this.localidad;
	}
	
	/**
	 * @param localidad
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	/**
	 * @return idPais
	 */	
	public int getIdPais() {
		return this.idPais;
	}
	
	/**
	 * @param idPais
	 */
	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}
	
	/**
	 * @return fecAlta
	 */	
	public Date getFecAlta() {
		return this.fecAlta;
	}
	
	/**
	 * @param fecAlta
	 */
	public void setFecAlta(Date fecAlta) {
		this.fecAlta = fecAlta;
	}
	
	/**
	 * @return fecModif
	 */	
	public Date getFecModif() {
		return this.fecModif;
	}
	
	/**
	 * @param fecModif
	 */
	public void setFecModif(Date fecModif) {
		this.fecModif = fecModif;
	}
	
	/**
	 * @return ctlUsuario
	 */	
	public int getCtlUsuario() {
		return this.ctlUsuario;
	}
	
	/**
	 * @param ctlUsuario
	 */
	public void setCtlUsuario(int ctlUsuario) {
		this.ctlUsuario = ctlUsuario;
	}
	
	/**
	 * @return ctlEstado
	 */	
	public int getCtlEstado() {
		return this.ctlEstado;
	}
	
	/**
	 * @param ctlEstado
	 */
	public void setCtlEstado(int ctlEstado) {
		this.ctlEstado = ctlEstado;
	}

	/**
	 * @return serialVersionUID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
