package es.manuelvv.figuras.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tr_telefonos")
public class Telefono {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_telefono")
	private Long id;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "fec_alta")
	private Date fec_alta;
	
	@Column(name = "fec_modif")
	private Date fec_modif;
	
	@Column(name = "ctl_usuario")
	private int ctl_usuario;
	
	@Column(name = "ctl_estado")
	private int ctl_estado;
	
	public Telefono() {}

	public Telefono(Long id,
					String telefono) {
		setId(id);
		setTelefono(telefono);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
