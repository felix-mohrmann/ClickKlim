package ClickKlim;

public class GameValues {
	
	private double cookies;
	private double cookieClickGain;
	private double percentageClickGain;
	private double cookieAutoGain;
	private double percentageAutoGain;
	private double storage;
	
	public GameValues() {
		cookies = 0;
		cookieClickGain = 1;
		percentageClickGain = 1;
		cookieAutoGain = 0;
		percentageAutoGain = 1;
		storage = 100;
	}
	
	//cookies
	public double getCookies() {
		return cookies;
	}
	public void setCookies(double cookies) {
		this.cookies = cookies;
	}
	//cookieClickGain
	public double getCookieClickGain() {
		return cookieClickGain;
	}
	public void setCookieClickGain(double cookieClickGain) {
		this.cookieClickGain = cookieClickGain;
	}
	//percentageClickGain
	public double getPercentageClickGain() {
		return percentageClickGain;
	}
	public void setPercentageClickGain(double percentageClickGain) {
		this.percentageClickGain = percentageClickGain;
	}
	//cookieAutoGain
	public double getCookieAutoGain() {
		return cookieAutoGain;
	}

	public void setCookieAutoGain(double cookieAutoGain) {
		this.cookieAutoGain = cookieAutoGain;
	}
	//percentageAutoGain
	public double getPercentageAutoGain() {
		return percentageAutoGain;
	}
	public void setPercentageAutoGain(double percentageAutoGain) {
		this.percentageAutoGain = percentageAutoGain;
	}
	//storage
	public double getStorage() {
		return storage;
	}
	public void setStorage(double storage) {
		this.storage = storage;
	}
}
