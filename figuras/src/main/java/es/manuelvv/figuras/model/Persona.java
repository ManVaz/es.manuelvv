package es.manuelvv.figuras.model;

import java.util.*;

import javax.persistence.*;

import es.manuelvv.figuras.model.Domicilio;
import es.manuelvv.figuras.model.Telefono;

@Entity
@Table(name="tr_personas")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_persona")
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "id_tipo_documento")
	private int id_tipo_documento;
	
	@Column(name = "num_documento")
	private String num_documento;
	
	@Column(name = "fec_alta")
	private Date fec_alta;
	
	@Column(name = "fec_modif")
	private Date fec_modif;
	
	@Column(name = "ctl_usuario")
	private int ctl_usuario;
	
	@Column(name = "fec_baja")
	private Date fec_baja;
	
	@Column(name = "ctl_estado")
	private int ctl_estado;
	
	@OneToMany(cascade = CascadeType.ALL,
			   fetch = FetchType.LAZY)
	@JoinColumn(name="id_persona")
	private List<Domicilio> domicilios = new ArrayList<Domicilio>();
	
	@OneToMany(cascade = CascadeType.ALL,
			   fetch = FetchType.LAZY)
	@JoinColumn(name="id_persona")
	private List<Telefono> telefonos = new ArrayList<Telefono>();
	
	public Persona(){}
	
	public Persona(Long id,
				   String nombre,
				   String apellidos,
				   Integer id_tipo_documento,
				   String num_documento,
				   Date fec_alta,
				   Date fec_modif,
				   Integer ctl_usuario,
				   Date fec_baja,
				   Integer ctl_estado){
		
		setId(id);
		setNombre(nombre);
		setApellidos(apellidos);
		setId_tipo_documento(id_tipo_documento);
		setNum_documento(num_documento);
		setFec_alta(fec_alta);
		setFec_modif(fec_modif);
		setCtl_usuario(ctl_usuario);
		setFec_baja(fec_baja);
		setCtl_estado(ctl_estado);
		
	}

	public void addDomicilio(Domicilio domicilio){
		
		domicilios.add(domicilio);
	}
	
	public void addTelefono(Telefono telefono){
		
		telefonos.add(telefono);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getId_tipo_documento() {
		return id_tipo_documento;
	}

	public void setId_tipo_documento(int id_tipo_documento) {
		this.id_tipo_documento = id_tipo_documento;
	}

	public String getNum_documento() {
		return num_documento;
	}

	public void setNum_documento(String num_documento) {
		this.num_documento = num_documento;
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

	public Date getFec_baja() {
		return fec_baja;
	}

	public void setFec_baja(Date fec_baja) {
		this.fec_baja = fec_baja;
	}

	public int getCtl_estado() {
		return ctl_estado;
	}

	public void setCtl_estado(int ctl_estado) {
		this.ctl_estado = ctl_estado;
	}

	public List<Domicilio> getDomicilios() {
		return domicilios;
	}

	public void setDomicilios(List<Domicilio> domicilios) {
		this.domicilios = domicilios;
	}

	public List<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	
}
