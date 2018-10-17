package co.com.patrones.daofactory.daoimpl;

import java.util.List;

import co.com.patrones.daofactory.dao.AsignaturaDAO;
import co.com.patrones.daofactory.pojo.Asignatura;

public class AsignaturaOracleDAOImpl implements AsignaturaDAO {

	@Override
	public int insert(Asignatura asignatura) throws Exception {
		System.out.println("Insertando asignatura en Oracle DB");
		return 0;
	}

	@Override
	public int delete(Asignatura asignatura) throws Exception {
		System.out.println("Eliminando asignatura en Oracle DB");
		return 0;
	}

	@Override
	public int update(Asignatura asignatura) throws Exception {
		System.out.println("Actualizando asignatura en Oracle DB");
		return 0;
	}

	@Override
	public Asignatura getById(String key) throws Exception {
		System.out.println("Consultando asignatura por id en Oracle DB");
		return null;
	}

	@Override
	public List<Asignatura> getAll() throws Exception {
		System.out.println("Consultando listado asignatura en Oracle DB");
		return null;
	}


}
