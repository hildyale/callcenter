package registro.BL;

import java.util.Date;
import java.util.List;

import registro.Exception.BLException;
import registro.dto.Registro;

public interface RegistroBL {
	

	public List<Registro> ObtenerTodosRegistros() throws BLException;
	
	public List<Registro> ObtenerRegistrosByMotivo(Integer idMotivo) throws BLException;
	
	public List<Registro> ObtenerRegistrosByMes(Date mes) throws BLException;

}
