package co.com.proxypattern.proxy;

public class RealVideo implements IVideo {
	
	private String urlVideo;
	
	public RealVideo(String urlVideo) {
		this.urlVideo = urlVideo;
	}
	
	@Override
	public String getShow() {
		return urlVideo;
	}
	
}
