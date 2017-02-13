package registro.web.dto;

import javax.xml.bind.annotation.XmlRootElement;
/**
 * dto para el pais
 * @author alejandro.isazad
 *
 */
@XmlRootElement(name="Pais")
public class PaisWs {
	private Integer id;
	private String nombre;
	
	public PaisWs(){
		super();
	}
	
	public PaisWs(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
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
	
	

}
