package registro.dto;

import java.util.Date;

/**
 * dto para el usuario
 * @author alejandro.isazad
 *
 */

public class Usuario {
	private Integer id;
	private String nombre;
	private String apellidos;
	private String correo;
	private Date fechaInicio;
	private String contrasena;
	private String telefono;
	private String idEmpresa;
	private String tipo;
	private Integer admitido;
	private Integer proyecto;
	 
	public Usuario() {
		super();
	}
	
	

	public Usuario(Integer id, String nombre, String apellidos, String correo, Date fechaInicio, String contrasena,
			String telefono, String idEmpresa, String tipo, Integer admitido,Integer proyecto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.fechaInicio = fechaInicio;
		this.contrasena = contrasena;
		this.telefono = telefono;
		this.idEmpresa = idEmpresa;
		this.tipo = tipo;
		this.admitido = admitido;
		this.proyecto = proyecto;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fecha) {
		this.fechaInicio = fecha;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getAdmitido() {
		return admitido;
	}

	public void setAdmitido(Integer admitido) {
		this.admitido = admitido;
	}
	
	public Integer getProyecto() {
		return proyecto;
	}

	public void setProyecto(Integer proyecto) {
		this.proyecto = proyecto;
	}

   

}

