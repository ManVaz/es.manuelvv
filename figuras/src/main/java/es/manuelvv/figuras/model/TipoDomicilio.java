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
	private Long id;
	
	@Id
	@Column(name = "idioma")
	private String idioma;
	
	@Column(name = "desc_tipo_domicilio")
	private String desc_tipo_domicilio;
	
	@Column(name = "fec_alta")
	private Date fec_alta;
	
	@Column(name = "fec_modif")
	private Date fec_modif;
	
	@Column(name = "ctl_usuario")
	private int ctl_usuario;
	
	@Column(name = "ctl_estado")
	private int ctl_estado;
	
	public TipoDomicilio() {}
	
	public TipoDomicilio(Long id,
						 String idioma,
						 String desc_tipo_domicilio,
						 Date fec_alta,
						 Date fec_modif,
						 int ctl_usuario,
						 int ctl_estado) {
		this.setId(id);
		this.setIdioma(idioma);
		this.setDesc_tipo_domicilio(desc_tipo_domicilio);
		this.setFec_alta(fec_alta);
		this.setFec_modif(fec_modif);
		this.setCtl_usuario(ctl_usuario);
		this.setCtl_estado(ctl_estado);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getDesc_tipo_domicilio() {
		return desc_tipo_domicilio;
	}

	public void setDesc_tipo_domicilio(String desc_tipo_domicilio) {
		this.desc_tipo_domicilio = desc_tipo_domicilio;
	}

	public Date getFec_alta() {
		return fec_alta;
	}

	public void setFec_alta(Date fec_alta) {
		this.fec_alta = fec_alta;
	}

	public Date getFec_modif() {
		return fec_modif;
	}

	public void setFec_modif(Date fec_modif) {
		this.fec_modif = fec_modif;
	}

	public int getCtl_usuario() {
		return ctl_usuario;
	}

	public void setCtl_usuario(int ctl_usuario) {
		this.ctl_usuario = ctl_usuario;
	}

	public int getCtl_estado() {
		return ctl_estado;
	}

	public void setCtl_estado(int ctl_estado) {
		this.ctl_estado = ctl_estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
