package javabasiccourse;
import java.*;
public class Circle {
	private double radius;
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		if(radius>=0) {this.radius=radius;}
		else {this.radius=0;}
	}
	public double getRadius() {
		return this.radius;
	}
	public double getArea() {
		return (Math.PI*radius*radius);
	}	
}
