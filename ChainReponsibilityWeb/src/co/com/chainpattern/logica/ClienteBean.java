package co.com.chainpattern.logica;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import co.com.chainpattern.handlerconcrete.Banco;

@ManagedBean
@ViewScoped
public class ClienteBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 187309259473975929L;
	private Solicitud solicitud;
	private Banco banco;

	@PostConstruct
	private void init() {
		solicitud = new Solicitud();
	}

	public void solicitar() {
		try {
			banco = new Banco();
			banco.solicitudPrestamos(solicitud);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Se ha realizado la Solicitud", "Solicitud Prestamo"));
			FacesContext.getCurrentInstance().getPartialViewContext().getRenderIds().add("globalMessage");
			solicitud = new Solicitud();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Solicitud getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(Solicitud solicitud) {
		this.solicitud = solicitud;
	}

}
