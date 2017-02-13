package registro.web.dto;

import javax.xml.bind.annotation.XmlRootElement;
/**
 * dto para el motivo
 * @author alejandro.isazad
 *
 */
@XmlRootElement(name="Motivo")
public class MotivoWs {
	private Integer id;
	private String nombre;
	
	public MotivoWs(){
		super();
	}
	
	public MotivoWs(Integer id, String nombre) {
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
