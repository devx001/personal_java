package co.com.builderpattern.main;

public class Main {
	
	public static void main(String[] args) {
		try {
			Estudiante estudiante = new Estudiante();
			QueryDirector queryDirector = new QueryDirector(new SQLQueryBuilder(), estudiante);
			queryDirector.construirQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
