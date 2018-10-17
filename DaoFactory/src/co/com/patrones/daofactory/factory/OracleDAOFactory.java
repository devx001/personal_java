package co.com.patrones.daofactory.factory;

import co.com.patrones.daofactory.dao.AsignaturaDAO;
import co.com.patrones.daofactory.dao.EstudianteDAO;
import co.com.patrones.daofactory.daoimpl.AsignaturaOracleDAOImpl;
import co.com.patrones.daofactory.daoimpl.EstudianteOracleDAOImpl;

public class OracleDAOFactory extends DAOFactory {

	@Override
	public EstudianteDAO getEstudianteDAO() {
		return new EstudianteOracleDAOImpl();
	}

	@Override
	public AsignaturaDAO getAsignaturaDAO() {
		return new AsignaturaOracleDAOImpl();
	}

}
