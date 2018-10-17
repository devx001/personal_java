package co.com.proxypattern.proxy;

public class VideoProxy implements IVideo {
	
	private RealVideo	realVideo;
	private String		urlImage;
	private String		urlVideo;
	
	public VideoProxy(String urlImage, String urlVideo) {
		this.urlImage = urlImage;
		this.urlVideo = urlVideo;
	}
	
	public String getDisplay() {
		return urlImage;
	}
	
	@Override
	public String getShow() {
		if(realVideo == null) {
			realVideo = new RealVideo(urlVideo);
		}
		return realVideo.getShow();
	}
	
}
