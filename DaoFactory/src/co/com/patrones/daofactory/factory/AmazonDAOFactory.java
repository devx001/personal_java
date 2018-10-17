package co.com.patrones.daofactory.factory;

import co.com.patrones.daofactory.dao.AsignaturaDAO;
import co.com.patrones.daofactory.dao.EstudianteDAO;
import co.com.patrones.daofactory.daoimpl.AsignaturaAmazonDAOImpl;
import co.com.patrones.daofactory.daoimpl.EstudianteAmazonDAOImpl;

public class AmazonDAOFactory extends DAOFactory {

	@Override
	public EstudianteDAO getEstudianteDAO() {
		return new EstudianteAmazonDAOImpl();
	}

	@Override
	public AsignaturaDAO getAsignaturaDAO() {
		return new AsignaturaAmazonDAOImpl();
	}


}
