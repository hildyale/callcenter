package registro.BL.Impl;

import java.util.Date;
import java.util.List;

import registro.BL.RegistroBL;
import registro.Exception.BLException;
import registro.Exception.MyDaoException;
import registro.dao.RegistroDao;
import registro.dto.Motivo;
import registro.dto.Registro;
import registro.dto.Usuario;

public class RegistroBLImpl implements RegistroBL {

	
	
	private RegistroDao registroDao;

	private static final int MIN_PASSWORD_LENGHT = 8;
	
	/**
	 * metodo contructor de la clase
	 * @param usuarioDao
	 */
	public RegistroBLImpl(RegistroDao registroDao) {
		this.registroDao = registroDao;
	}
	
	@Override
	public List<Registro> ObtenerTodosRegistros() throws BLException {
		  List<Registro> registros = null;
			
				try {
					registros = registroDao.getAllRegistros();
				} catch (MyDaoException e) {
					throw new BLException(e.getMessage());
				}
				return registros;
	}

	@Override
	public List<Registro> ObtenerRegistrosByMotivo(Integer idMotivo) throws BLException {
		  List<Registro> registros = null;
			
			try {
				Motivo motivo = new Motivo(idMotivo, "");
				registros = registroDao.getRegistrosByMotivo(motivo);
			} catch (MyDaoException e) {
				throw new BLException(e.getMessage());
			}
			return registros;
	}

	@Override
	public List<Registro> ObtenerRegistrosByMes(Date mes) throws BLException {
		 List<Registro> registros = null;
			
			try {
				registros = registroDao.getRegistrosByMes(mes);
			} catch (MyDaoException e) {
				throw new BLException(e.getMessage());
			}
			return registros;
	}

}
