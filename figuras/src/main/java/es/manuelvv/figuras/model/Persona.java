package es.manuelvv.figuras.model;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

import es.manuelvv.figuras.model.Domicilio;
import es.manuelvv.figuras.model.Telefono;

@Entity
@Table(name="tr_personas")
public class Persona
implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_persona")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "id_tipo_documento")
	private int idTipoDocumento;
	
	@Column(name = "num_documento")
	private String numDocumento;
	
	@Column(name = "fec_alta")
	private Date fecAlta;
	
	@Column(name = "fec_modif")
	private Date fecModif;
	
	@Column(name = "ctl_usuario")
	private int ctlUsuario;
	
	@Column(name = "fec_baja")
	private Date fecBaja;
	
	@Column(name = "ctl_estado")
	private int ctlEstado;
	
	@OneToMany(cascade = CascadeType.ALL,
			   fetch = FetchType.LAZY)
	@JoinColumn(name="id_persona", nullable=false)
	private List<Domicilio> domicilios = new ArrayList<Domicilio>();
	
	@OneToMany(cascade = CascadeType.ALL,
			   fetch = FetchType.LAZY)
	@JoinColumn(name="id_persona", nullable=false)
	private List<Telefono> telefonos = new ArrayList<Telefono>();
	
	public Persona(){}
	
	public Persona(int id,
				   String nombre,
				   String apellidos,
				   Integer idTipoDocumento,
				   String numDocumento,
				   Date fecAlta,
				   Date fecModif,
				   Integer ctlUsuario,
				   Date fecBaja,
				   Integer ctlEstado){
		
		setId(id);
		setNombre(nombre);
		setApellidos(apellidos);
		setIdTipoDocumento(idTipoDocumento);
		setNumDocumento(numDocumento);
		setFecAlta(fecAlta);
		setFecModif(fecModif);
		setCtlUsuario(ctlUsuario);
		setFecBaja(fecBaja);
		setCtlEstado(ctlEstado);
		
	}

		
	@Override
	public String toString() {
		return "Persona [num_documento=" + numDocumento + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, idTipoDocumento, nombre, numDocumento);
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Persona)) {
			return false;
		}
		Persona other = (Persona) obj;
		return Objects.equals(apellidos, other.apellidos) && idTipoDocumento == other.idTipoDocumento
				&& Objects.equals(nombre, other.nombre) && Objects.equals(numDocumento, other.numDocumento);
		
	}

	public void addDomicilio(Domicilio domicilio){
		
		domicilios.add(domicilio);
	}
	
	public void addTelefono(Telefono telefono){
		
		telefonos.add(telefono);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getIdTipoDocumento() {
		return idTipoDocumento;
	}

	public void setIdTipoDocumento(int idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
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

	public Date getFecBaja() {
		return fecBaja;
	}

	public void setFecBaja(Date fecBaja) {
		this.fecBaja = fecBaja;
	}

	public int getCtlEstado() {
		return ctlEstado;
	}

	public void setCtlEstado(int ctlEstado) {
		this.ctlEstado = ctlEstado;
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
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
