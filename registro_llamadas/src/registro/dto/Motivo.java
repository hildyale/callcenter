package registro.dto;

public class Motivo {
	private Integer id;
	private String nombre;
	
	public Motivo(){
		super();
	}
	
	public Motivo(Integer id, String nombre) {
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
