package javabasiccourse;

public class Calculator {
	private Floor floor;
	private Carpet carpet;
	public Calculator(Floor floor,Carpet carpet) {
		// TODO Auto-generated constructor stub
		this.floor=floor;
		this.carpet=carpet;
	}
	public double getTotalCost() {
		return (this.carpet.getCost()*this.floor.getArea());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Carpet carpet = new Carpet(3.5);
Floor floor = new Floor(2.75, 4.0);
Calculator calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());
carpet = new Carpet(1.5);
floor = new Floor(5.4, 4.5);
calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());

	}

}
