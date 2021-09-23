package javabasiccourse;

public class ComplexNumber {
	private double real,imaginary;
	public ComplexNumber(double a, double b) {
		// TODO Auto-generated constructor stub
		this.real=a;
		this.imaginary=b;
	}
	public double getReal() {
		return this.real;
	}
	public double getImaginary() {
		return this.imaginary;
	}
	public void add(double a, double b) {
		this.real=this.real+a;
		this.imaginary=this.imaginary+b;
		}
	public void add(ComplexNumber complex) {
		this.imaginary=this.imaginary+complex.getImaginary();
		this.real=this.real+complex.getReal();
	}
	public void subtract(double a, double b) {
		this.real=this.real-a;
		this.imaginary=this.imaginary-b;
		}
	public void subtract(ComplexNumber complex) {
		this.imaginary=this.imaginary-complex.getImaginary();
		this.real=this.real-complex.getReal();
	}
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumber one = new ComplexNumber(1.0, 1.0);
		ComplexNumber number = new ComplexNumber(2.5, -1.5);
		one.add(1,1);
		System.out.println("one.real= " + one.getReal());
		System.out.println("one.imaginary= " + one.getImaginary());
		one.subtract(number);
		System.out.println("one.real= " + one.getReal());
		System.out.println("one.imaginary= " + one.getImaginary());
		number.subtract(one);
		System.out.println("number.real= " + number.getReal());
		System.out.println("number.imaginary= " + number.getImaginary());

	}*/

}
