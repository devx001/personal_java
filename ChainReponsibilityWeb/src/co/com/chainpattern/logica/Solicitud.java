package co.com.chainpattern.logica;

import java.math.BigDecimal;

public class Solicitud {

	private String nombreSolicitante;
	private String emailSolicitante;
	private BigDecimal monto;
	private String motivo;
	private String mailAprobador;

	public String getNombreSolicitante() {
		return nombreSolicitante;
	}

	public void setNombreSolicitante(String nombreSolicitante) {
		this.nombreSolicitante = nombreSolicitante;
	}

	public String getEmailSolicitante() {
		return emailSolicitante;
	}

	public void setEmailSolicitante(String emailSolicitante) {
		this.emailSolicitante = emailSolicitante;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getMailAprobador() {
		return mailAprobador;
	}

	public void setMailAprobador(String mailAprobador) {
		this.mailAprobador = mailAprobador;
	}

}
