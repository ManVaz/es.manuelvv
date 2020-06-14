package es.manuelvv.figuras.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Clase TipoDocumento
 * 
 * Clase para la gestión de un tipo de documento
 *
 * @author Manuel Vázquez
 * @version 1.0
 */
@Entity
@Table(name="tr_tipo_documento")
@org.hibernate.annotations.Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class TipoDocumento
implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_documento")
	private int id;
	
	@Id
	@Column(name = "idioma")
	private String idioma;
	
	@Column(name = "desc_tipo_documento")
	private String descTipoDocumento;
	
	@Column(name = "fec_Alta")
	private Date fecAlta;
	
	@Column(name = "fec_Modif")
	private Date fecModif;
	
	@Column(name = "ctl_Usuario")
	private int ctlUsuario;
	
	/**
	 * Constructor vacio
	 */	
	public TipoDocumento() {}
	
	/**
	 * Constructor con todos los parametros
	 * @param id
	 * @param descTipoDocumento
	 * @param fecAlta
	 * @param fecModif
	 * @param ctlUsuario
	 */
	public TipoDocumento(int id,
						  String descTipoDocumento,
						  Date fecAlta,
						  Date fecModif,
						  int ctlUsuario) {
		this.setId(id);
		this.setDescTipoDocumento(descTipoDocumento);
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
	 * @return descTipoDocumento
	 */
	public String getDescTipoDocumento() {
		return this.descTipoDocumento;
	}

	/**
	 * @param descTipoDocumento
	 */
	public void setDescTipoDocumento(String descTipoDocumento) {
		this.descTipoDocumento = descTipoDocumento;
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
