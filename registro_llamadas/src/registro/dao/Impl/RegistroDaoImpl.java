package registro.dao.Impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import registro.Exception.MyDaoException;
import registro.dao.RegistroDao;
import registro.dto.Motivo;
import registro.dto.Registro;

public class RegistroDaoImpl implements RegistroDao {

	private SessionFactory sessionFactory;

	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public Registro getRegistroById(Integer id) throws MyDaoException {
		Session session = null;
		Registro registro= null;
		
		try {
			session = sessionFactory.openSession(); 
			Criteria crit = session.createCriteria(Registro.class).add(Restrictions.eq("id", id));
			registro = (Registro) crit.uniqueResult(); 
			
		} catch (HibernateException e) {
			throw new MyDaoException(e);
		}
		
		return registro;
	}
	

	@Override
	public void saveRegistro(Registro Registro) throws MyDaoException {
		Session session = null;
		// necesario para poder hacer commit a las transacciones
		Transaction transaction=null;
		
		try {
			session = sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			session.save(Registro);
			// para poder guardar la transation
			transaction.commit();
		} catch (HibernateException e) {
			// TODO: handle exception
			throw new MyDaoException(e);
		}

	}

	@Override
	public void updateRegistro(Registro Registro) throws MyDaoException {
		Session session = null;
		Transaction transaction=null;
		
		try {
			session = sessionFactory.openSession();
			transaction= session.beginTransaction();
			session.update(Registro);
			transaction.commit();
			
		} catch (HibernateException e) {
			// TODO: handle exception
			throw new MyDaoException(e);
		}	

	}

	@Override
	public void deleteRegistro(Integer id) throws MyDaoException {
		Session session = null;
		Transaction transaction=null;
		Registro registro = new Registro();
		registro.setId(id);
		
		try {
			session = sessionFactory.openSession();
			transaction=session.beginTransaction();
			session.delete(registro);
			transaction.commit();
			
		} catch (HibernateException e) {
			// TODO: handle exception
			throw new MyDaoException(e);
		}

	}

	@Override
	public List<Registro> getAllRegistros() throws MyDaoException {
		Session session = null;
		List<Registro> registros= null;
		
		try {
			session = sessionFactory.openSession(); 
			Criteria crit = session.createCriteria(Registro.class);
			registros = crit.list(); 
			
		} catch (HibernateException e) {
			// TODO: handle exception
			throw new MyDaoException(e);
		}
		return registros;
	}

	@Override
	public List<Registro> getRegistrosByMes(Date mes) throws MyDaoException {
		Session session = null;
		List<Registro> registros= null;
		
		try {
			session = sessionFactory.openSession(); 
			Criteria crit = session.createCriteria(Registro.class).add(Restrictions.eq("fecha", mes));
			registros = crit.list(); 
			
		} catch (HibernateException e) {
			throw new MyDaoException(e);
		}
		
		return registros;
	}

	@Override
	public List<Registro> getRegistrosByMeses(Date mes1, Date mes2) throws MyDaoException {
		Session session = null;
		List<Registro> registros= null;
		
		try {
			session = sessionFactory.openSession(); 
			Criteria crit = session.createCriteria(Registro.class).add(Restrictions.between("fecha", mes1, mes2));
			registros = crit.list(); 
			
		} catch (HibernateException e) {
			throw new MyDaoException(e);
		}
		
		return registros;
	}

	@Override
	public List<Registro> getRegistrosByMotivo(Motivo motivo) throws MyDaoException {
		Session session = null;
		List<Registro> registros= null;
		
		try {
			session = sessionFactory.openSession(); 
			Criteria crit = session.createCriteria(Registro.class).add(Restrictions.eq("motivo", motivo));
			registros = crit.list(); 
			
		} catch (HibernateException e) {
			throw new MyDaoException(e);
		}
		
		return registros;
	}

}
