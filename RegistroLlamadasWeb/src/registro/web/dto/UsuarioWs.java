package registro.web.dto;


import javax.xml.bind.annotation.XmlRootElement;

/**
 * dto para el usuario
 * @author alejandro.isazad
 *
 */
@XmlRootElement(name="Usuario")
public class UsuarioWs {
	private String nombre;
	private String apellidos;
	private String correo;

	 
	public UsuarioWs() {
		super();
	}
	
	

	public UsuarioWs(String nombre, String apellidos, String correo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
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

	
   

}

