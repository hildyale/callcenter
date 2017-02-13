package registro.dao;

import java.util.List;

import registro.Exception.MyDaoException;
import registro.dto.Usuario;

/**
 * Interfaz de usuario que tiene los metodos que se pueden usar
 * @author alejandro.isazad
 *
 */
public interface UsuarioDao {

	
	/**
	 * metodo para obtener un usuario a traves de su id
	 * @param id
	 * @return
	 * @throws MyDaoException
	 */
	public Usuario getUsuarioById(Integer id) throws MyDaoException;
	
	/**
	 * metodo para obtener un usuario a traves de su correo
	 * @param correo
	 * @return
	 * @throws MyDaoException
	 */
	public Usuario getUsuarioByCorreo(String Correo) throws MyDaoException;
	
	/**
	 * metodo para agregar un nuevo usuario a la base de datos
	 * @param Usuario
	 * @throws MyDaoException
	 */
	public void saveUsuario(Usuario Usuario) throws MyDaoException;

	/**
	 * metodo para realizar modificaciones a un usuario almacenado
	 * @param Usuario
	 * @throws MyDaoException
	 */
	public void updateUsuario(Usuario Usuario) throws MyDaoException;
	
	/**
	 * metodo para eliminar un usuario de la base de datos
	 * @param id
	 * @throws MyDaoException
	 */
	public void deleteUsuario(Integer id) throws MyDaoException; 
	
	public List<Usuario> getAllUsuarios() throws MyDaoException;

}
