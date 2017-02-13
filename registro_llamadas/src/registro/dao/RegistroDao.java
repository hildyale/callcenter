package registro.dao;

import java.util.Date;
import java.util.List;

import registro.Exception.MyDaoException;
import registro.dto.Motivo;
import registro.dto.Registro;

/**
 * Interfaz de Registro que tiene los metodos que se pueden usar
 * @author alejandro.isazad
 *
 */
public interface RegistroDao {

	
	/**
	 * metodo para obtener un Registro a traves de su id
	 * @param id
	 * @return
	 * @throws MyDaoException
	 */
	public Registro getRegistroById(Integer id) throws MyDaoException;
	
	/**
	 * metodo para obtener un Registro por mes
	 * @param mes
	 * @return
	 * @throws MyDaoException
	 */
	public List<Registro> getRegistrosByMes(Date mes) throws MyDaoException;
	
	/**
	 * metodo para obtener un Registro a traves de su correo
	 * @param mes1,mes2
	 * @return
	 * @throws MyDaoException
	 */
	public List<Registro> getRegistrosByMeses(Date mes1,Date mes2) throws MyDaoException;
	
	/**
	 * metodo para obtener un Registro por motivo
	 * @param correo
	 * @return
	 * @throws MyDaoException
	 */
	public List<Registro> getRegistrosByMotivo(Motivo motivo) throws MyDaoException;
	
	/**
	 * metodo para agregar un nuevo Registro a la base de datos
	 * @param Registro
	 * @throws MyDaoException
	 */
	public void saveRegistro(Registro Registro) throws MyDaoException;

	/**
	 * metodo para realizar modificaciones a un Registro almacenado
	 * @param Registro
	 * @throws MyDaoException
	 */
	public void updateRegistro(Registro Registro) throws MyDaoException;
	
	/**
	 * metodo para eliminar un Registro de la base de datos
	 * @param id
	 * @throws MyDaoException
	 */
	public void deleteRegistro(Integer id) throws MyDaoException; 
	
	public List<Registro> getAllRegistros() throws MyDaoException;

}
