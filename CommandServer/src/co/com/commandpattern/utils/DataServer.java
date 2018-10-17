package co.com.commandpattern.utils;

public class DataServer {

	private String status;
	private String host;
	private String user;
	private String pass;
	private boolean osBase;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public boolean isOsBase() {
		return osBase;
	}

	public void setBaseOs(boolean osBase) {
		this.osBase = osBase;
	}

}
