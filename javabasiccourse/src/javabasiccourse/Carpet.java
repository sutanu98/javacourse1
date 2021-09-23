package javabasiccourse;

public class Carpet {
	private double cost;
	public Carpet() {
		this(0.0);
	}
	public Carpet(double a) {
		setCost(a);
	}
	private void setCost(double a) {
		if(a>=0.0) {
			this.cost=a;
		}
		else {
			this.cost=0.0;
		}
	}
	public double getCost() {
		return this.cost;
	}

}
