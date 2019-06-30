package ClickKlim;

public class GameValues {
	
	private double milk;
	private double milkClickGain;
	private double percentageClickGain;
	private double milkAutoGain;
	private double percentageAutoGain;
	private double storage;
	
	public GameValues() {
		milk = 0;
		milkClickGain = 1;
		percentageClickGain = 1;
		milkAutoGain = 0;
		percentageAutoGain = 1;
		storage = 100;
	}
	
	public GameValues(double milk, double milkClickGain, double percentageClickGain, double milkAutoGain, double percentageAutoGain, double storage) {
		this.milk = milk;
		this.milkClickGain = milkClickGain;
		this.percentageClickGain = percentageClickGain;
		this.milkAutoGain = milkAutoGain;
		this.percentageAutoGain = percentageAutoGain;
		this.storage = storage;
	}
	
	//cookies
	public double getCookies() {
		return milk;
	}
	public void setCookies(double cookies) {
		this.milk = cookies;
	}
	//cookieClickGain
	public double getCookieClickGain() {
		return milkClickGain;
	}
	public void setCookieClickGain(double cookieClickGain) {
		this.milkClickGain = cookieClickGain;
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
		return milkAutoGain;
	}

	public void setCookieAutoGain(double cookieAutoGain) {
		this.milkAutoGain = cookieAutoGain;
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
