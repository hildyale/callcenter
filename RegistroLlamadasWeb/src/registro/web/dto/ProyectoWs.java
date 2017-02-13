package registro.web.dto;

import java.util.Date;

/**
 * dto para el proyecto
 * @author alejandro.isazad
 *
 */

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="proyecto")
public class ProyectoWs {
	private Integer id;
	private String nombre;
	private Date fecha;
	private UsuarioWs admin;
	
	public ProyectoWs(){
		super();
	}
	
	public ProyectoWs(Integer id, String nombre, Date fecha, UsuarioWs admin) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.admin = admin;
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
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public UsuarioWs getAdmin() {
		return admin;
	}
	public void setAdmin(UsuarioWs admin) {
		this.admin = admin;
	}
	
	

}
