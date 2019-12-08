package es.manuelvv.figuras.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Clase TipoDomicilio
 * 
 * Clase para la gestión de un tipo de domicilio
 *
 * @author Manuel Vázquez
 * @version 1.0
 */
@Entity
@Table(name="tr_tipo_domicilio")
@org.hibernate.annotations.Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class TipoDomicilio 
implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_domicilio")
	private int id;
	
	@Id
	@Column(name = "idioma")
	private String idioma;
	
	@Column(name = "desc_tipo_domicilio")
	private String descTipoDomicilio;
	
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
	public TipoDomicilio() {}
	
	/**
	 * Constructor con todos los atributos
	 * @param id
	 * @param idioma
	 * @param descTipoDomicilio
	 * @param fecAlta
	 * @param fecModif
	 * @param ctlUsuario
	 * @param ctlEstado
	 */
	public TipoDomicilio(int id,
						 String idioma,
						 String descTipoDomicilio,
						 Date fecAlta,
						 Date fecModif,
						 int ctlUsuario,
						 int ctlEstado) {
		this.setId(id);
		this.setIdioma(idioma);
		this.setDescTipoDomicilio(descTipoDomicilio);
		this.setFecAlta(fecAlta);
		this.setFecModif(fecModif);
		this.setCtlUsuario(ctlUsuario);
		this.setCtlEstado(ctlEstado);
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
	 * @return descTipoDomicilio
	 */
	public String getDescTipoDomicilio() {
		return this.descTipoDomicilio;
	}

	/**
	 * @param descTipoDomicilio
	 */
	public void setDescTipoDomicilio(String descTipoDomicilio) {
		this.descTipoDomicilio = descTipoDomicilio;
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
