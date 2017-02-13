package registro.dao.Impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import registro.Exception.MyDaoException;
import registro.dao.UsuarioDao;
import registro.dto.Usuario;

public class UsuarioDaoImpl implements UsuarioDao {

	private SessionFactory sessionFactory;

	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public Usuario getUsuarioById(Integer id) throws MyDaoException {
		Session session = null;
		Usuario user= null;
		
		try {
			session = sessionFactory.openSession(); 
			Criteria crit = session.createCriteria(Usuario.class).add(Restrictions.eq("id", id));
			user = (Usuario) crit.uniqueResult(); 
			
		} catch (HibernateException e) {
			throw new MyDaoException(e);
		}
		
		return user;
	}
	
	@Override
	public Usuario getUsuarioByCorreo(String correo) throws MyDaoException {
		Session session = null;
		Usuario user= null;
		
		try {
			session = sessionFactory.openSession(); 
			Criteria crit = session.createCriteria(Usuario.class).add(Restrictions.eq("correo", correo));
			user = (Usuario) crit.uniqueResult(); 
			
		} catch (HibernateException e) {
			throw new MyDaoException(e);
		}
		
		return user;
	}

	@Override
	public void saveUsuario(Usuario Usuario) throws MyDaoException {
		Session session = null;
		// necesario para poder hacer commit a las transacciones
		Transaction transaction=null;
		
		try {
			session = sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			session.save(Usuario);
			// para poder guardar la transation
			transaction.commit();
		} catch (HibernateException e) {
			// TODO: handle exception
			throw new MyDaoException(e);
		}

	}

	@Override
	public void updateUsuario(Usuario Usuario) throws MyDaoException {
		Session session = null;
		Transaction transaction=null;
		
		try {
			session = sessionFactory.openSession();
			transaction= session.beginTransaction();
			session.update(Usuario);
			transaction.commit();
			
		} catch (HibernateException e) {
			// TODO: handle exception
			throw new MyDaoException(e);
		}	

	}

	@Override
	public void deleteUsuario(Integer id) throws MyDaoException {
		Session session = null;
		Transaction transaction=null;
		Usuario user = new Usuario();
		user.setId(id);
		
		try {
			session = sessionFactory.openSession();
			transaction=session.beginTransaction();
			session.delete(user);
			transaction.commit();
			
		} catch (HibernateException e) {
			// TODO: handle exception
			throw new MyDaoException(e);
		}

	}

	@Override
	public List<Usuario> getAllUsuarios() throws MyDaoException {
		Session session = null;
		List<Usuario> users= null;
		
		try {
			session = sessionFactory.openSession(); 
			Criteria crit = session.createCriteria(Usuario.class).add(Restrictions.eq("admitido", 0));
			users = crit.list(); 
			
		} catch (HibernateException e) {
			// TODO: handle exception
			throw new MyDaoException(e);
		}
		return users;
	}

}
