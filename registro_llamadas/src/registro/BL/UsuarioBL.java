package registro.BL;

import java.util.List;

import registro.Exception.BLException;
import registro.Exception.MyDaoException;
import registro.dto.Usuario;

public interface UsuarioBL {
	
	/**
	 * Metodo que valida que un usuario exista en la base de datos
	 * @param correo
	 * @param contrasena
	 * @throws BlException
	 */
	public Usuario validarUsuario(String correo, String contrasena) throws BLException;


	/**
	 * Metodo que crea un usuario en la base de datos
	 * @param cedula
	 * @param name
	 * @param lastname
	 * @param salary
	 * @param email
	 * @param password
	 * @throws MyDaoException
	 */
	public void crearUsuario(String nombre, String apellidos, String correo,String contrasena,
			String telefono, String idEmpresa) throws BLException;
	
	/**
	 * Metodo que elimina un Usuario dato su id
	 * @param id
	 * @throws MyDaoException
	 */
	public void eliminarUsuario(Integer id) throws BLException;
	
	/**
	 * Metodo que actualiza un Usuario exista en la base de datos
	 * @throws MyDaoException
	 */
	public void actualizarUsuario(String nombre, String apellidos, String correo,String contrasena,
			String telefono, String idEmpresa) throws BLException;

	/**
	 * Metodo que lista todos los Usuarios.
	 * @return
	 */
	public List<Usuario> ObtenerTodosUsuarios() throws BLException;

}
