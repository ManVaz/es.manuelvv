package es.manuelvv.figuras.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;

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
	
	public Pais() {}
	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodPais() {
		return codPais;
	}

	public void setCodPais(String codPais) {
		this.codPais = codPais;
	}

	public String getDescPais() {
		return descPais;
	}

	public void setDescPais(String descPais) {
		this.descPais = descPais;
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

	public int getCtlUusuario() {
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
