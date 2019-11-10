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
	private String desc_tipo_documento;
	
	@Column(name = "fec_alta")
	private Date fec_alta;
	
	@Column(name = "fec_modif")
	private Date fec_modif;
	
	@Column(name = "ctl_usuario")
	private int ctl_usuario;
	
	public TipoDocumento() {}
	
	public TipoDocumento(int id,
						  String desc_tipo_documento,
						  Date fec_alta,
						  Date fec_modif,
						  int ctl_usuario) {
		this.setId(id);
		this.setDesc_tipo_documento(desc_tipo_documento);
		this.setFec_alta(fec_alta);
		this.setFec_modif(fec_modif);
		this.setCtl_usuario(ctl_usuario);
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

	public String getDesc_tipo_documento() {
		return desc_tipo_documento;
	}

	public void setDesc_tipo_documento(String desc_tipo_documento) {
		this.desc_tipo_documento = desc_tipo_documento;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
