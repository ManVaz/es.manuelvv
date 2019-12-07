package es.manuelvv.figuras.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;

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
	
	public Estado() {}
	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescEstado() {
		return descEstado;
	}

	public void setDescEstado(String descEstado) {
		this.descEstado = descEstado;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
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
