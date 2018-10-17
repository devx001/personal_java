package co.com.patrones.daofactory.main;

import co.com.patrones.daofactory.dao.AsignaturaDAO;
import co.com.patrones.daofactory.factory.DAOFactory;
import co.com.patrones.daofactory.pojo.Asignatura;

public class Main {
	
	public static void main(String[] args) {
		try {
			DAOFactory daoFactory = DAOFactory.getDAOFactory(DAOFactory.AMAZONDB);
			AsignaturaDAO asignaturaDAO = daoFactory.getAsignaturaDAO();
			asignaturaDAO.insert(new Asignatura());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
