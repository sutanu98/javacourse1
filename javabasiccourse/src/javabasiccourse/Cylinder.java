package javabasiccourse;

public class Cylinder extends Circle {
	private double height;
	public Cylinder(double radius,  double height) {
		// TODO Auto-generated constructor stub
		super(radius);
		if(height>=0){this.height=height;}
		else {this.height=0;}
	}
	public double getHeight() {
		return this.height;
	}
	public double getVolume() {
		return (this.height*getArea());
	}
	public static void main(String[] args) {
		Circle circle = new Circle(3.75);
		System.out.println("circle.radius= " + circle.getRadius());
		System.out.println("circle.area= " + circle.getArea());
		Cylinder cylinder = new Cylinder(5.55, 7.25);
		System.out.println("cylinder.radius= " + cylinder.getRadius());
		System.out.println("cylinder.height= " + cylinder.getHeight());
		System.out.println("cylinder.area= " + cylinder.getArea());
		System.out.println("cylinder.volume= " + cylinder.getVolume());

	}
}
