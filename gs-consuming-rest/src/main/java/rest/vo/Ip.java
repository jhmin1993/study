package rest.vo;

public class Ip {
	
	private String origin;

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "Ip [origin=" + origin + "]";
	}

}
