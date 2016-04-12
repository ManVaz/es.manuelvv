package es.manuelvv.figuras.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="tr_usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Long id;
	
	@Column(name = "alias")	
	private String alias;
	
	@Column(name = "email")	
	private String email;
	
	@Column(name = "fec_baja")
	private Date fec_baja;
	
	@Column(name = "intentos")
	private Integer intentos;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "fec_alta")
	private Date fec_alta;
	
	@Column(name = "fec_modif")
	private Date fec_modif;
	
	@Column(name = "ctl_usuario")
	private Integer ctl_usuario;
	
	@Column(name = "ctl_estado")
	private Integer ctl_estado;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_persona")
	private Persona persona;
	
	public Usuario() {}

	public Usuario(Long id,
				   String alias,
				   String email,
				   Date fec_alta,
				   Date fec_baja,
				   Integer intentos,
				   Date fec_modif,
				   Integer ctl_usuario,
				   Integer ctl_estado,	
				   Persona persona){
		
		setId(id);
		setAlias(alias);
		setEmail(email);
		setFec_alta(fec_alta);
		setFec_baja(fec_baja);
		setIntentos(intentos);
		setFec_modif(fec_modif);
		setCtl_usuario(ctl_usuario);
		setPersona(persona);
		setCtl_estado(ctl_estado);
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Date getFec_alta() {
		return fec_alta;
	}

	public void setFec_alta(Date fec_alta) {
		this.fec_alta = fec_alta;
	}

	public Date getFec_baja() {
		return fec_baja;
	}

	public void setFec_baja(Date fec_baja) {
		this.fec_baja = fec_baja;
	}

	public Integer getIntentos() {
		return intentos;
	}

	public void setIntentos(Integer intentos) {
		this.intentos = intentos;
	}

	public Date getFec_modif() {
		return fec_modif;
	}

	public void setFec_modif(Date fec_modif) {
		this.fec_modif = fec_modif;
	}

	public Integer getCtl_usuario() {
		return ctl_usuario;
	}

	public void setCtl_usuario(Integer ctl_usuario) {
		this.ctl_usuario = ctl_usuario;
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

	public Integer getCtl_estado() {
		return ctl_estado;
	}

	public void setCtl_estado(Integer ctl_estado) {
		this.ctl_estado = ctl_estado;
	}

}

