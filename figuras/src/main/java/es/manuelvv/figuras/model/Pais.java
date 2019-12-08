package es.manuelvv.figuras.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Clase Pais
 * 
 * Clase para la gestión de un pais
 *
 * @author Manuel Vázquez
 * @version 1.0
 */
@Entity
@Table(name="tr_paises")
@org.hibernate.annotations.Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Pais 
implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_paises")
	private int id;
	
	@Column(name = "cod_pais")
	private String codPais;
	
	@Column(name = "desc_pais")
	private String descPais;
	
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
	public Pais() {}
	
	/**
	 * Contructor con todos los atributos
	 * @param id
	 * @param codPais
	 * @param descPais
	 * @param fecAlta
	 * @param fecModif
	 * @param ctlUsuario
	 * @param ctlEstado
	 */
	public Pais(int id,
				String codPais,
				String descPais,
				Date fecAlta,
				Date fecModif,
				int ctlUsuario,
				int ctlEstado){
		this.setId(id);
		this.setCodPais(codPais);
		this.setDescPais(descPais);
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
	 * @return codPais
	 */
	public String getCodPais() {
		return this.codPais;
	}

	/**
	 * @param codPais
	 */
	public void setCodPais(String codPais) {
		this.codPais = codPais;
	}

	/**
	 * @return descPais
	 */
	public String getDescPais() {
		return this.descPais;
	}

	/**
	 * @param descPais
	 */
	public void setDescPais(String descPais) {
		this.descPais = descPais;
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
	public int getCtlUusuario() {
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
