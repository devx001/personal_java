package co.com.patrones.daofactory.dao;

import java.util.List;

import co.com.patrones.daofactory.pojo.Estudiante;

public interface EstudianteDAO {
	
	public int insert(Estudiante estudiante) throws Exception;
	public int delete(Estudiante estudiante) throws Exception;
	public int update(Estudiante estudiante) throws Exception;
	public Estudiante getById(String key) throws Exception;
	public List<Estudiante> getAll() throws Exception;

}
