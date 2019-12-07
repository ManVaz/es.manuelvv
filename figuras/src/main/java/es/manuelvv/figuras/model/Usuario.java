package es.manuelvv.figuras.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="tr_usuarios")
public class Usuario 
implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private int id;
	
	@Column(name = "alias")	
	private String alias;
	
	@Column(name = "email")	
	private String email;
	
	@Column(name = "fec_baja")
	private Date fecBaja;
	
	@Column(name = "intentos")
	private Integer intentos;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "fec_alta")
	private Date fecAlta;
	
	@Column(name = "fecModif")
	private Date fecModif;
	
	@Column(name = "ctl_usuario")
	private Integer ctlUsuario;
	
	@Column(name = "ctl_estado")
	private Integer ctlEstado;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_persona")
	private Persona persona;
	
	public Usuario() {}

	public Usuario(int id,
				   String alias,
				   String email,
				   Date fecAlta,
				   Date fecBaja,
				   Integer intentos,
				   Date fecModif,
				   Integer ctlUsuario,
				   Integer ctlEstado,	
				   Persona persona){
		
		setId(id);
		setAlias(alias);
		setEmail(email);
		setFecAlta(fecAlta);
		setFecBaja(fecBaja);
		setIntentos(intentos);
		setFecModif(fecModif);
		setCtlUsuario(ctlUsuario);
		setPersona(persona);
		setCtlEstado(ctlEstado);
		
	}
		
	@Override
	public String toString() {
		return "Usuario [alias=" + alias + ", numDocumento =" + persona.getNumDocumento() + ", persona=" + persona.getNombre() + " " + persona.getApellidos() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(alias);
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Usuario)) {
			return false;
		}
		Usuario other = (Usuario) obj;
		return Objects.equals(alias, other.alias);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFecAlta() {
		return fecAlta;
	}

	public void setFecAlta(Date fecAlta) {
		this.fecAlta = fecAlta;
	}

	public Date getFecBaja() {
		return fecBaja;
	}

	public void setFecBaja(Date fecBaja) {
		this.fecBaja = fecBaja;
	}

	public Integer getIntentos() {
		return intentos;
	}

	public void setIntentos(Integer intentos) {
		this.intentos = intentos;
	}

	public Date getFecModif() {
		return fecModif;
	}

	public void setFecModif(Date fecModif) {
		this.fecModif = fecModif;
	}

	public Integer getCtlUsuario() {
		return ctlUsuario;
	}

	public void setCtlUsuario(Integer ctlUsuario) {
		this.ctlUsuario = ctlUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Integer getCtlEstado() {
		return ctlEstado;
	}

	public void setCtlEstado(Integer ctlEstado) {
		this.ctlEstado = ctlEstado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}

