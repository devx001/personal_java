package co.com.patrones.daofactory.factory;

import co.com.patrones.daofactory.dao.AsignaturaDAO;
import co.com.patrones.daofactory.dao.EstudianteDAO;

//Abstract class DAO Factory
public abstract class DAOFactory {

	public static final int AMAZONDB = 1;
	public static final int MONGODB = 2;
	public static final int ORACLE = 3;

	public abstract EstudianteDAO getEstudianteDAO();
	public abstract AsignaturaDAO getAsignaturaDAO();

	public static DAOFactory getDAOFactory(int whichFactory) {

		switch (whichFactory) {
			case AMAZONDB:
				return new AmazonDAOFactory();
			case MONGODB:
				return new MongoDAOFactory();
			case ORACLE:
				return new OracleDAOFactory();
			default:
				return null;
		}
	}
}