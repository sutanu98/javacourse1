package javabasiccourse;

public class Floor {

	
	private double width,length;
	public Floor() {
		this(0.0,0.0);
	}
	public Floor(double a , double b) {
		setWidth(a);
		setLength(b);
		}
	private void setWidth(double a) {
		if(a>=0.0) {
		this.width=a;
	}
		else {
			this.width=0.0;
		}
	}
	private void setLength(double b) {
		if(b>=0.0){
			this.length=b;
		}
		else {
			this.length=0.0;
		}
	}
	public double getLength() {
		return this.length;
	}
	public double getWidth() {
		return this.width;
	}
	public double getArea() {
		return (this.length*this.width);
	}
	/*public Floor() {
		// TODO Auto-generated constructor stub
	}*/

}
