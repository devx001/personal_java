package co.com.singleton.controladores;

public class Controlador1 extends Controlador {

	public int dividir(int a, int b) {
		if(b==0) {
			warning("Se puede presentar una excepcion ya que el denominador es cero");
		}
		
		int result = 0;
		try {
			result = a/b;
		} catch (Exception e) {
			error("Se ha generado un error", e);
		}
		
		info("Se ha ejecutado el proceso, division " + a + "/" + b+" ="+ result);
		
		return result;
	}
	
}