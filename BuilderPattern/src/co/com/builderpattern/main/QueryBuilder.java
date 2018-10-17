package co.com.builderpattern.main;

public abstract class QueryBuilder {
	
	protected Query query;
	private Generico pojo;
	
	public abstract void buildFields() throws Exception;
	public abstract void buildTables() throws Exception;
	public abstract void buildConditions() throws Exception;
	public abstract void buildGroupBy() throws Exception;
	public abstract void buildHaving() throws Exception;
	public abstract void buildOrderBy() throws Exception;

	public Query getQuery() {
		return query;
	}
	
	public void crearNuevaQuery() {
		query = new Query();
	}
	
	public Generico getPojo() {
		return pojo;
	}

	public void setPojo(Generico pojo) {
		this.pojo = pojo;
	}
	
}
