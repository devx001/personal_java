package co.com.builderpattern.main;

import java.util.List;

public class SQLQueryBuilder extends QueryBuilder{
	
	@Override
	public void buildFields() throws Exception{
		StringBuilder sb = new StringBuilder();
		List<String> campos = ClassUtils.getCampos(getPojo().getClass());
		for (String campo : campos) {
			sb.append(campo);
			sb.append(",");
		}
		
		query.setFields(sb.substring(0, sb.length() - 1));
	}

	@Override
	public void buildTables() throws Exception{
		query.setTable(getPojo().getNombreTabla());
	}

	@Override
	public void buildConditions() throws Exception{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildGroupBy() throws Exception{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildHaving() throws Exception{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildOrderBy() throws Exception{
		// TODO Auto-generated method stub
		
	}
		
}
