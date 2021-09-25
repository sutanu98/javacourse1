package javabasiccourse;

public class Lamp {
	private String style;
	private boolean battery;
	private int globRating;
	public Lamp(String style, boolean battery, int globRating) {
		super();
		this.style = style;
		this.battery = battery;
		this.globRating = globRating;
	}
	private void turnOn() {
		System.out.println("Lamp -> Turning On");
	}
	private String getStyle() {
		return this.style;
	}
	private boolean isBattery() {
		return this.battery;
	}
	private int getGlobRating() {
		return this.globRating;
	}

}
