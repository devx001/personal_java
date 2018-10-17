package co.com.patrones.daofactory.factory;

import co.com.patrones.daofactory.dao.AsignaturaDAO;
import co.com.patrones.daofactory.dao.EstudianteDAO;
import co.com.patrones.daofactory.daoimpl.AsignaturaMongoDAOImpl;
import co.com.patrones.daofactory.daoimpl.EstudianteMongoDAOImpl;

public class MongoDAOFactory extends DAOFactory {

	@Override
	public EstudianteDAO getEstudianteDAO() {
		return new EstudianteMongoDAOImpl();
	}

	@Override
	public AsignaturaDAO getAsignaturaDAO() {
		return new AsignaturaMongoDAOImpl();
	}

}
