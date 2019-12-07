package es.manuelvv.figuras.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;

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
	
	@Column(name = "fecAlta")
	private Date fecAlta;
	
	@Column(name = "fecModif")
	private Date fecModif;
	
	@Column(name = "ctlUsuario")
	private int ctlUsuario;
	
	public TipoDocumento() {}
	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getDescTipoDocumento() {
		return descTipoDocumento;
	}

	public void setDescTipoDocumento(String descTipoDocumento) {
		this.descTipoDocumento = descTipoDocumento;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
