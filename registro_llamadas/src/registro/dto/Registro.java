package registro.dto;

import java.util.Date;

public class Registro {
	private Integer id;
	private Date fecha;
	private Pais pais;
	private Usuario colaborador;
	private Motivo motivo;
	private String comentario;
	private String terminadaPor;
	
	public Registro(){
		super();
	}
	
	public Registro(Integer id, Date fecha, Pais pais, Usuario colaborador, Motivo motivo, String comentario,
			String terminadaPor) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.pais = pais;
		this.colaborador = colaborador;
		this.motivo = motivo;
		this.comentario = comentario;
		this.terminadaPor = terminadaPor;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Usuario getColaborador() {
		return colaborador;
	}
	public void setColaborador(Usuario colaborador) {
		this.colaborador = colaborador;
	}
	public Motivo getMotivo() {
		return motivo;
	}
	public void setMotivo(Motivo motivo) {
		this.motivo = motivo;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getTerminadaPor() {
		return terminadaPor;
	}
	public void setTerminadaPor(String terminadaPor) {
		this.terminadaPor = terminadaPor;
	}
	
	

}
