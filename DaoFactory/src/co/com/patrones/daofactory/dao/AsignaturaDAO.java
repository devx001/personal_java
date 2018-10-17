package co.com.patrones.daofactory.dao;

import java.util.List;

import co.com.patrones.daofactory.pojo.Asignatura;

public interface AsignaturaDAO { 
	
	public int insert(Asignatura asignatura) throws Exception;
	public int delete(Asignatura asignatura) throws Exception;
	public int update(Asignatura asignatura) throws Exception;
	public Asignatura getById(String key) throws Exception;
	public List<Asignatura> getAll() throws Exception;

}
