package es.manuelvv.figuras.model;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

import es.manuelvv.figuras.model.Domicilio;
import es.manuelvv.figuras.model.Telefono;

/**
 * Clase Persona
 * 
 * Clase para la gestión de un persona
 *
 * @author Manuel Vázquez
 * @version 1.0
 */
/**
 * @author manue
 *
 */
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
	private Set<Domicilio> domicilios = new HashSet<Domicilio>();
	
	@OneToMany(cascade = CascadeType.ALL,
			   fetch = FetchType.LAZY)
	@JoinColumn(name="id_persona", nullable=false)
	private Set<Telefono> telefonos = new HashSet<Telefono>();
	
	/**
	 * Constructor vacio
	 */	
	public Persona(){}
	
	/**
	 * Constructor con todos los atributos
	 * @param id
	 * @param nombre
	 * @param apellidos
	 * @param idTipoDocumento
	 * @param numDocumento
	 * @param fecAlta
	 * @param fecModif
	 * @param ctlUsuario
	 * @param fecBaja
	 * @param ctlEstado
	 */
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

		
	/**
	 * Metodo que devuelve el documento y nombre de la persona
	 * @return documento y nombre de la persona
	 */
	@Override
	public String toString() {
		return "Persona [num_documento=" + this.numDocumento + ", nombre=" + this.nombre + ", apellidos=" + this.apellidos + "]";
	}

	
	/**
	 * Metodo para generar un hash code.
	 * @return int con la hash calculada
	 */
	@Override
	public int hashCode() {
		return Objects.hash(this.apellidos, this.idTipoDocumento, this.nombre, this.numDocumento);
	}

	
	/**
	 * Metodo para comparar 2 objetos de tipo persona
	 * @return True/false según sea o no iguales los objetos
	 */
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Persona)) {
			return false;
		}
		Persona other = (Persona) obj;
		return Objects.equals(this.apellidos, other.apellidos) && this.idTipoDocumento == other.idTipoDocumento
				&& Objects.equals(this.nombre, other.nombre) && Objects.equals(this.numDocumento, other.numDocumento);
		
	}

	
	/**
	 * @param domicilio
	 */
	public void addDomicilio(Domicilio domicilio){
		
		domicilios.add(domicilio);
	}
	
	/**
	 * @param telefono
	 */
	public void addTelefono(Telefono telefono){
		
		telefonos.add(telefono);
	}
	
	/**
	 * @return id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return nombre
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return apellidos
	 */
	public String getApellidos() {
		return this.apellidos;
	}

	/**
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return idTipoDocumento
	 */
	public int getIdTipoDocumento() {
		return this.idTipoDocumento;
	}

	/**
	 * @param idTipoDocumento
	 */
	public void setIdTipoDocumento(int idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

	/**
	 * @return numDocumento
	 */
	public String getNumDocumento() {
		return this.numDocumento;
	}

	/**
	 * @param numDocumento
	 */
	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	/**
	 * @return fecAlta
	 */
	public Date getFecAlta() {
		return this.fecAlta;
	}

	/**
	 * @param fecAlta
	 */
	public void setFecAlta(Date fecAlta) {
		this.fecAlta = fecAlta;
	}

	/**
	 * @return fecModif
	 */
	public Date getFecModif() {
		return this.fecModif;
	}

	/**
	 * @param fecModif
	 */
	public void setFecModif(Date fecModif) {
		this.fecModif = fecModif;
	}

	/**
	 * @return ctlUsuario
	 */
	public int getCtlUsuario() {
		return this.ctlUsuario;
	}

	/**
	 * @param ctlUsuario
	 */
	public void setCtlUsuario(int ctlUsuario) {
		this.ctlUsuario = ctlUsuario;
	}

	/**
	 * @return fecBaja
	 */
	public Date getFecBaja() {
		return this.fecBaja;
	}

	/**
	 * @param fecBaja
	 */
	public void setFecBaja(Date fecBaja) {
		this.fecBaja = fecBaja;
	}

	/**
	 * @return ctlEstado
	 */
	public int getCtlEstado() {
		return this.ctlEstado;
	}

	/**
	 * @param ctlEstado
	 */
	public void setCtlEstado(int ctlEstado) {
		this.ctlEstado = ctlEstado;
	}

	/**
	 * @return domicilios
	 */
	public Set<Domicilio> getDomicilios() {
		return this.domicilios;
	}

	/**
	 * @param domicilios
	 */
	public void setDomicilios(Set<Domicilio> domicilios) {
		this.domicilios = domicilios;
	}

	/**
	 * @return telefonos
	 */
	public Set<Telefono> getTelefonos() {
		return this.telefonos;
	}

	/**
	 * @param telefonos
	 */
	public void setTelefonos(Set<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	
	/**
	 * @return serialVersionUID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
