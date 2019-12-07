package es.manuelvv.figuras.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;

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
	
	public TipoDomicilio() {}
	
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

	public String getDescTipoDomicilio() {
		return descTipoDomicilio;
	}

	public void setDescTipoDomicilio(String descTipoDomicilio) {
		this.descTipoDomicilio = descTipoDomicilio;
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
