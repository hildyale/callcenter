package registro.BL.Impl;

import java.util.Date;
import java.util.List;

import registro.Exception.MyDaoException;
import registro.dto.Usuario;
import registro.util.Validaciones;
import registro.util.encode.Base64Coder;
import registro.dao.UsuarioDao;
import registro.BL.UsuarioBL;
import registro.Exception.BLException;

public class UsuarioBLImpl implements UsuarioBL {

	private UsuarioDao usuarioDao;

	private static final int MIN_PASSWORD_LENGHT = 8;
	
	/**
	 * metodo contructor de la clase
	 * @param usuarioDao
	 */
	public UsuarioBLImpl(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}
	
	@Override
	public Usuario validarUsuario(String correo, String contrasena) throws BLException {
		Usuario usuario = null;
		String passCoded = null;
					
		if (correo == null || "".equals(correo.trim())) {
			throw new BLException("Debe especificar un email.");
		}
		
		if (!Validaciones.isEmail(correo)) {
			throw new BLException("El email debe ser un correo electronico v�lido.");
		}
		
		if(contrasena == null || "".equals(contrasena.trim())){
			throw new BLException("Debe especificar una contraseña valida.");
		}
		
		if(contrasena.length() < MIN_PASSWORD_LENGHT ){
			throw new BLException("La contraseña debe tener minimo "+MIN_PASSWORD_LENGHT+" caracteres.");
		}

		try {
			usuario = usuarioDao.getUsuarioByCorreo(correo);
		} catch (MyDaoException e) {
			// TODO: handle exception
			throw new BLException(e.getMessage());				
		}
			
		passCoded = Base64Coder.encodeString(contrasena);
		
		if (usuario == null || !passCoded.equals(usuario.getContrasena())) {
			/**
			 * Se muestra el error sin mostrar informacion sensible.
			 */
			throw new BLException("Los datos proporcionados son incorrectos.");
		}
		return usuario;
	}

	@Override
	public void crearUsuario(String nombre, String apellidos, String correo, String contrasena, String telefono,
			String idEmpresa) throws BLException {

		if (nombre == null || "".equals(nombre.trim())) {
			throw new NullPointerException("Debe especificar el nombre del usuario.");
        }
		if (apellidos == null || "".equals(apellidos.trim())) {
			throw new NullPointerException("Debe especificar el apellido del usuario.");
        }
		if (telefono == null || "".equals(telefono.trim())) {
			throw new NullPointerException("Debe especificar el telefono del usuario.");
        }
		if (idEmpresa == null || "".equals(idEmpresa.trim())) {
			throw new NullPointerException("Debe especificar la id de la empresa del usuario.");
        }
		if (correo == null || "".equals(correo.trim())) {
			throw new NullPointerException("Debe especificar el correo del usuario.");
        }
		if (contrasena == null || "".equals(contrasena.trim())) {
			throw new NullPointerException("Debe especificar la contraseña del usuario.");
        }
		
		if (!Validaciones.isEmail(correo)) {
			throw new BLException("El email debe ser un correo electronico valido.");
		}
		
        try{
		Usuario user = usuarioDao.getUsuarioByCorreo(correo);
		if(user != null){
			throw new MyDaoException("Ya existe un usuario con este email.");
		}
		
		Date fecha = new Date();
		
	    user = new Usuario();
	    user.setNombre(nombre);
	    user.setApellidos(apellidos);
	    user.setContrasena(Base64Coder.encodeString(contrasena));
	    user.setCorreo(correo);
	    user.setFechaInicio(fecha);
	    user.setIdEmpresa(idEmpresa);
	    user.setTelefono(telefono);
	    user.setAdmitido(0);
	    user.setTipo("colaborador");
	    
	    usuarioDao.saveUsuario(user);
        }
	    catch (MyDaoException e) {
			throw new BLException(e.getMessage());
		}

	}

	@Override
	public void eliminarUsuario(Integer id) throws BLException {
		
		if (id == null) {
			throw new NullPointerException("Debe especificar el id del usuario.");
        }
		try{
			
		Usuario user = usuarioDao.getUsuarioById(id);
		
		if(user == null){
			throw new BLException("No existe un usuario con esta cedula.");
		}
		
		usuarioDao.deleteUsuario(id);
		}
		catch (MyDaoException e) {
			throw new BLException(e.getMessage());
		}

	}

	@Override
	public void actualizarUsuario(String nombre, String apellidos, String correo, String contrasena, String telefono,
			String idEmpresa) throws BLException {
		
		if (correo == null || "".equals(correo.trim())) {
			throw new NullPointerException("Debe especificar el correo del usuario.");
        }
       
	}

	@Override
	public List<Usuario> ObtenerTodosUsuarios() throws BLException {
		  List<Usuario> users = null;
			
			try {
				users = usuarioDao.getAllUsuarios();
			} catch (MyDaoException e) {
				throw new BLException(e.getMessage());
			}
			return users;
	}

}
