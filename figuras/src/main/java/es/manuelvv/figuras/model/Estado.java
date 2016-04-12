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
	private Long id;
	
	@Id
	@Column(name = "idioma")
	private String idioma;
	
	@Column(name = "desc_estado")
	private String desc_estado;
	
	@Column(name = "fec_alta")
	private Date fec_alta;
	
	@Column(name = "fec_modif")
	private Date fec_modif;
	
	@Column(name = "ctl_usuario")
	private int ctl_usuario;
	
	public Estado() {}
	
	public Estado(Long id,
				  String desc_estado,
				  String idioma,
				  Date fec_alta,
				  Date fec_modif,
				  int ctl_usuario)	{
		
		this.setId(id);
		this.setDesc_estado(desc_estado);
		this.setIdioma(idioma);
		this.setFec_alta(fec_alta);
		this.setFec_modif(fec_modif);
		this.setCtl_usuario(ctl_usuario);
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesc_estado() {
		return desc_estado;
	}

	public void setDesc_estado(String desc_estado) {
		this.desc_estado = desc_estado;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
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

}
