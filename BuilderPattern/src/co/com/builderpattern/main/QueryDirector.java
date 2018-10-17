package co.com.builderpattern.main;

public class QueryDirector {
	
	private QueryBuilder queryBuilder;
	
	public QueryDirector(QueryBuilder queryBuilder, Generico pojo) {
		this.queryBuilder = queryBuilder;
		this.queryBuilder.setPojo(pojo);
	}
	
	public Query getQuery() {
		return queryBuilder.getQuery();
	}
	
	public void construirQuery() throws Exception{
		queryBuilder.buildFields();
		queryBuilder.buildTables();
		queryBuilder.buildConditions();
		queryBuilder.buildGroupBy();
		queryBuilder.buildHaving();
		queryBuilder.buildOrderBy();
	}
	
}
