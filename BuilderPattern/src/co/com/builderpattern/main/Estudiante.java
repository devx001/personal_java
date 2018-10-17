package co.com.builderpattern.main;

public class Estudiante extends Generico {
	
	private Integer	codigo;
	private String	nombre;
	private String	apellidos;
	private String	documento;
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getDocumento() {
		return documento;
	}
	
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	@Override
	public String getNombreTabla() {
		return "Estudiante";
	}
}
