package registro.dto;

import java.util.Date;

public class Proyecto {
	private Integer id;
	private String nombre;
	private Date fecha;
	private Usuario admin;
	
	public Proyecto(){
		super();
	}
	
	public Proyecto(Integer id, String nombre, Date fecha, Usuario admin) {
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
	public Usuario getAdmin() {
		return admin;
	}
	public void setAdmin(Usuario admin) {
		this.admin = admin;
	}
	
	

}
