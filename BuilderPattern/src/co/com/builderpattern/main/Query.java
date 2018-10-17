package co.com.builderpattern.main;

public class Query {
	
	private String	fields;
	private String	table;
	private String	conditions;
	private String	groupBy;
	private String	having;
	private String	orderBy;
	
	public String getFields() {
		return fields;
	}
	
	public void setFields(String fields) {
		this.fields = fields;
	}
	
	public String getTable() {
		return table;
	}
	
	public void setTable(String table) {
		this.table = table;
	}
	
	public String getConditions() {
		return conditions;
	}
	
	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
	
	public String getGroupBy() {
		return groupBy;
	}
	
	public void setGroupBy(String groupBy) {
		this.groupBy = groupBy;
	}
	
	public String getHaving() {
		return having;
	}
	
	public void setHaving(String having) {
		this.having = having;
	}
	
	public String getOrderBy() {
		return orderBy;
	}
	
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	
}
