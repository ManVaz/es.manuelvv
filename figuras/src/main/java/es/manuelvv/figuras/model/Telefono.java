package es.manuelvv.figuras.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Clase Telefono
 * 
 * Clase para la gestión de un telefono
 *
 * @author Manuel Vázquez
 * @version 1.0
 */
@Entity
@Table(name="tr_telefonos")
public class Telefono 
implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_telefono")
	private int id;
	
	@Column(name = "telefono")
	private String telefono;
	
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
	public Telefono() {}

	/**
	 * Constructor con todos los parametros
	 * @param id
	 * @param telefono
	 * @param fecAlta
	 * @param fecModif
	 * @param ctlUsuario
	 */
	public Telefono(int id,
					String telefono,
					Date fecAlta,
					Date fecModif,
					int ctlUsuario) {
		setId(id);
		setTelefono(telefono);
		setFecAlta(fecAlta);
		setFecModif(fecModif);
		setCtlUsuario(ctlUsuario);
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
	 * @return telefono
	 */
	public String getTelefono() {
		return this.telefono;
	}

	/**
	 * @return id
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
