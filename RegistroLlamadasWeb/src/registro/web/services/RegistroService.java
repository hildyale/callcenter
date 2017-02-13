package registro.web.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import registro.Exception.BLException;
import registro.Exception.MyDaoException;
import registro.dto.Registro;
import registro.dto.Usuario;
import registro.web.dto.RegistroWs;
import registro.web.dto.UsuarioWs;
import registro.BL.RegistroBL;

/**
 * Clase en la cual se exponen los servicios relacionados con los registros.
 * @author alejandro.isazad
 *
 */
@Component // se anota con Component para que spring lo cargue.
@Path("registro")
public class RegistroService {

	@Autowired 
	RegistroBL registroBL;
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("listar")
	public List<RegistroWs> obtenerEmpleados() throws MyDaoException, BLException{
		
		List<RegistroWs> resultado = new ArrayList<>();
		List<Registro> datos = null;
		SimpleDateFormat formatoLargoEsMX = new SimpleDateFormat("EEEE d 'de' MMMM 'de' yyyy HH:mm:ss", new Locale("ES", "MX"));
		datos = registroBL.ObtenerTodosRegistros();
		for(Registro registro:datos){
			String fecha = formatoLargoEsMX.format(registro.getFecha());
			Usuario colaborador = registro.getColaborador();
			UsuarioWs colaboradorWs = new UsuarioWs(colaborador.getNombre(),colaborador.getApellidos(),colaborador.getCorreo());
			resultado.add(new RegistroWs(registro.getId(),
					                     fecha,
					                     registro.getPais(),
					                     colaboradorWs,
					                     registro.getMotivo(),
					                     registro.getComentario(),
					                     registro.getTerminadaPor()));
		}
		return resultado;
	}
	
}
