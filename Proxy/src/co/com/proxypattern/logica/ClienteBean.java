package co.com.proxypattern.logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import co.com.proxypattern.proxy.IVideo;
import co.com.proxypattern.proxy.VideoProxy;

@ManagedBean
@ViewScoped
public class ClienteBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5351559754878503173L;
	private List<IVideo> listado;
	private IVideo mediaSelect;
	private String video;
	
	@PostConstruct
	private void init() {
		try {
			List<Media> listaInicio = Utils.lecturaJson();
			listado = new ArrayList<>();
			for (Media media : listaInicio) {
				listado.add(new VideoProxy(media.getUrlImage(), media.getUrlVideo()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void showVideo() {
		video = mediaSelect.getShow();
	}
	
	public List<IVideo> getListado() {
		return listado;
	}

	public IVideo getMediaSelect() {
		return mediaSelect;
	}

	public void setMediaSelect(IVideo mediaSelect) {
		this.mediaSelect = mediaSelect;
	}

	public String getVideo() {
		return video;
	}
}
