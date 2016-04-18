package es.manuelvv.figuras.model;

import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="tr_paises")
@org.hibernate.annotations.Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Pais {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_paises")
	private Long id;
	
	@Column(name = "cod_pais")
	private String cod_pais;
	
	@Column(name = "desc_pais")
	private String desc_pais;
	
	@Column(name = "fec_alta")
	private Date fec_alta;
	
	@Column(name = "fec_modif")
	private Date fec_modif;
	
	@Column(name = "ctl_usuario")
	private int ctl_usuario;
	
	@Column(name = "ctl_estado")
	private int ctl_estado;
	
	public Pais() {}
	
	public Pais(Long id,
				String cod_pais,
				String desc_pais,
				Date fec_alta,
				Date fec_modif,
				int ctl_usuario,
				int ctl_estado){
		this.setId(id);
		this.setCod_pais(cod_pais);
		this.setDesc_pais(desc_pais);
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

	public String getCod_pais() {
		return cod_pais;
	}

	public void setCod_pais(String cod_pais) {
		this.cod_pais = cod_pais;
	}

	public String getDesc_pais() {
		return desc_pais;
	}

	public void setDesc_pais(String desc_pais) {
		this.desc_pais = desc_pais;
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
		
}
