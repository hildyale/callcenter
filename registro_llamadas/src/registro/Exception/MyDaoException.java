package registro.Exception;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MyDaoException extends Exception {

	Logger  log = Logger.getLogger(this.getClass());

	public MyDaoException() {
		super();
		BasicConfigurator.configure();
	}

	private static final long serialVersionUID = 1L;

	public MyDaoException(String message, Throwable cause) {
		super(message, cause);

		log.error(message);
		// TODO Auto-generated constructor stub
	}

	public MyDaoException(Throwable cause) {
		super(cause);

		log.error(cause.getMessage());
		// TODO Auto-generated constructor stub
	}

	public MyDaoException(String message) {
		super(message);

		log.error(message);
		// TODO Auto-generated constructor stub
	}
	
	

	
	
	
	

}
