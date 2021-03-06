package es.manuelvv.figuras.model;

import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Objects;

import javax.persistence.*;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.manuelvv.figuras.DAO.UsuarioDAO;
import es.manuelvv.framework.bbdd.hibernate.HibernateSession;
import es.manuelvv.framework.utils.EncriptacionMD5;

/**
 * Clase Usuario
 * 
 * Clase para la gestión de un usuario
 *
 * @author Manuel Vázquez
 * @version 1.0
 */
/**
 * @author manue
 *
 */
/**
 * @author manue
 *
 */
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
	
	@Column(name = "fec_Modif")
	private Date fecModif;
	
	@Column(name = "ctl_usuario")
	private Integer ctlUsuario;
	
	@Column(name = "ctl_estado")
	private Integer ctlEstado;
	
	@OneToOne(cascade=CascadeType.ALL,
			  fetch = FetchType.LAZY)
	@JoinColumn(name="id_persona")
	private Persona persona;
	
	/**
	 * Constructor vacio
	 */	
	public Usuario() {}

	
	/**
	 * Constructor sin atributos
	 * @param id
	 * @param alias
	 * @param email
	 * @param fecAlta
	 * @param fecBaja
	 * @param intentos
	 * @param fecModif
	 * @param ctlUsuario
	 * @param ctlEstado
	 * @param persona
	 * @throws NoSuchAlgorithmException 
	 */
	public Usuario(int id,
				   String alias,
				   String email,
				   Date fecAlta,
				   Date fecBaja,
				   Integer intentos,
				   String password,
				   Date fecModif,
				   Integer ctlUsuario,
				   Integer ctlEstado,	
				   Persona persona) throws NoSuchAlgorithmException{
		
		setId(id);
		setAlias(alias);
		setEmail(email);
		setFecAlta(fecAlta);
		setFecBaja(fecBaja);
		setIntentos(intentos);
		setPassword(EncriptacionMD5.encriptar(password));
		setFecModif(fecModif);
		setCtlUsuario(ctlUsuario);
		setPersona(persona);
		setCtlEstado(ctlEstado);
		
	}
		
	/**
	 * Comprueba si con un alias y password si este existe
	 * @param alias
	 * @param password
	 * @return Usuario
	 */
	public boolean existUsuario(String alias, String password) {
		
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		
		boolean resultado = false;
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		resultado = usuarioDAO.existUsuario(session, alias, password);
		session.close();
		
		return resultado;
		
	}	
	
	/**
	 * Comprueba si con un alias si este existe
	 * @param alias
	 * @param password
	 * @return Usuario
	 */	
	public boolean existUsuario(String alias) {
		
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		
		boolean resultado = false;
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		resultado = usuarioDAO.existUsuario(session, alias);
		session.close();
		
		return resultado;
		
	}	
	
	/**
	 * Devuelvo un usuario si existe con alias y password
	 * @param alias
	 * @param password
	 * @return
	 */
	public Usuario logging(String alias, String password) {
		
		Session session = HibernateSession.getSession();
		Transaction tx = session.beginTransaction();
		
		Usuario usuario = new Usuario();
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		try {
			usuario = usuarioDAO.selectByUsuarioPass(session, alias, EncriptacionMD5.encriptar(password));
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("No existe usuario");
		} finally {
			tx.commit();
			session.close();
		}
		
		return usuario;
		
	}
	
	/**
	 * Metodo que devuelve el alias, el documento y nombre de la persona
	 * @return alias, documento y nombre de la persona
	 */
	@Override
	public String toString() {
		return "Usuario [alias=" + alias + ", numDocumento =" + this.persona.getNumDocumento() + ", this.persona=" + persona.getNombre() + " " + this.persona.getApellidos() + "]";
	}

	/**
	 * Metodo para generar un hash code.
	 * @return int con la hash calculada
	 */
	@Override
	public int hashCode() {
		return Objects.hash(alias);
	}

	/**
	 * Metodo para comparar 2 objetos de tipo usuario
	 * @return True/false según sea o no iguales los objetos
	 */
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
	 * @return alias
	 */
	public String getAlias() {
		return this.alias;
	}

	/**
	 * @param alias
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * @return email
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return intentos
	 */
	public Integer getIntentos() {
		return this.intentos;
	}

	/**
	 * @param intentos
	 */
	public void setIntentos(Integer intentos) {
		this.intentos = intentos;
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
	public Integer getCtlUsuario() {
		return this.ctlUsuario;
	}

	/**
	 * @param ctlUsuario
	 */
	public void setCtlUsuario(Integer ctlUsuario) {
		this.ctlUsuario = ctlUsuario;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * @param password
	 * @throws NoSuchAlgorithmException 
	 */
	public void setPassword(String password) throws NoSuchAlgorithmException {
		this.password = EncriptacionMD5.encriptar(password);
	}

	/**
	 * @return persona
	 */
	public Persona getPersona() {
		return this.persona;
	}

	/**
	 * @param persona
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	/**
	 * @return ctlEstado
	 */
	public Integer getCtlEstado() {
		return this.ctlEstado;
	}

	/**
	 * @param ctlEstado
	 */
	public void setCtlEstado(Integer ctlEstado) {
		this.ctlEstado = ctlEstado;
	}

	/**
	 * @return serialVersionUID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}

