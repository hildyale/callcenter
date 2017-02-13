package registro.web.dto;

import java.util.Date;
/**
 * dto para el registro
 * @author alejandro.isazad
 *
 */

import javax.xml.bind.annotation.XmlRootElement;

import registro.dto.Motivo;
import registro.dto.Pais;
import registro.dto.Usuario;
@XmlRootElement(name="Registro")
public class RegistroWs {
	private Integer id;
	private String fecha;
	private Pais pais;
	private UsuarioWs colaborador;
	private Motivo motivo;
	private String comentario;
	private String terminadaPor;
	
	public RegistroWs(){
		super();
	}
	
	public RegistroWs(Integer id, String fecha, Pais pais, UsuarioWs colaborador, Motivo motivo, String comentario,
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
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public UsuarioWs getColaborador() {
		return colaborador;
	}
	public void setColaborador(UsuarioWs colaborador) {
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
