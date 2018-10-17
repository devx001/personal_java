package co.com.patrones.daofactory.daoimpl;

import java.util.List;

import co.com.patrones.daofactory.dao.AsignaturaDAO;
import co.com.patrones.daofactory.pojo.Asignatura;

public class AsignaturaAmazonDAOImpl implements AsignaturaDAO { 

	@Override
	public int insert(Asignatura asignatura) throws Exception {
		System.out.println("Insertando asignatura en BD Amazon");
		return 0;
	}

	@Override
	public int delete(Asignatura asignatura) throws Exception {
		System.out.println("Eliminando asignatura en BD Amazon");
		return 0;
	}

	@Override
	public int update(Asignatura asignatura) throws Exception {
		System.out.println("Actualizando asignatura en BD Amazon");
		return 0;
	}

	@Override
	public Asignatura getById(String key) throws Exception {
		System.out.println("Consultando asignatura por id en BD Amazon");
		return null;
	}

	@Override
	public List<Asignatura> getAll() throws Exception {
		System.out.println("Consultando asignatura en BD Amazon");
		return null;
	}


}
