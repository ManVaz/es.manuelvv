package es.manuelvv.figuras.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="tr_telefonos")
public class Telefono 
implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_telefono")
	private int id;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "fec_alta")
	private Date fecAlta;
	
	@Column(name = "fec_modif")
	private Date fecModif;
	
	@Column(name = "ctl_usuario")
	private int ctlUsuario;
	
	@Column(name = "ctl_estado")
	private int ctlEstado;
	
	public Telefono() {}

	public Telefono(int id,
					String telefono) {
		setId(id);
		setTelefono(telefono);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
