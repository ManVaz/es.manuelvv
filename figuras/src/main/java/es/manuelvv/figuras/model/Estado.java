package es.manuelvv.figuras.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Clase Estado
 * 
 * Clase para la gestión de un estado
 *
 * @author Manuel Vázquez
 * @version 1.0
 */
@Entity
@Table(name="tr_estados")
@org.hibernate.annotations.Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Estado 
implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_estados")
	private int id;
	
	@Id
	@Column(name = "idioma")
	private String idioma;
	
	@Column(name = "desc_estado")
	private String descEstado;
	
	@Column(name = "fec_alta")
	private Date fecAlta;
	
	@Column(name = "fec_modif")
	private Date fecModif;
	
	@Column(name = "ctl_usuario")
	private int ctlUsuario;
	
	/**
	 * Constructor vacio
	 */	
	public Estado() {}
	
	/**
	 * Contructor con todos los atributos
	 * @param id
	 * @param descEstado
	 * @param idioma
	 * @param fecAlta
	 * @param fecModif
	 * @param ctlUsuario
	 */
	public Estado(int id,
				  String descEstado,
				  String idioma,
				  Date fecAlta,
				  Date fecModif,
				  int ctlUsuario)	{
		
		this.setId(id);
		this.setDescEstado(descEstado);
		this.setIdioma(idioma);
		this.setFecAlta(fecAlta);
		this.setFecModif(fecModif);
		this.setCtlUsuario(ctlUsuario);
		
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
	 * @return descEstado
	 */	
	public String getDescEstado() {
		return this.descEstado;
	}

	/**
	 * @param descEstado
	 */
	public void setDescEstado(String descEstado) {
		this.descEstado = descEstado;
	}

	/** 
	 * @return idioma
	 */	
	public String getIdioma() {
		return this.idioma;
	}

	/**
	 * @param idioma
	 */
	public void setIdioma(String idioma) {
		this.idioma = idioma;
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
	 * @return serialVersionUID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
