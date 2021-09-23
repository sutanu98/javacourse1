/**
 * 
 */
package javabasiccourse;

/**
 * @author sutanu
 *
 */
public class Wall {

	/**
	 * 
	 */
	private double width,height;
	public Wall() {
		this(0.0,0.0);
	}
	public Wall(double a , double b) {
		setWidth(a);
		setHeight(b);
		}
	private void setWidth(double a) {
		if(a>=0.0) {
		this.width=a;
	}
		else {
			this.width=0.0;
		}
	}
	private void setHeight(double b) {
		if(b>=0.0){
			this.height=b;
		}
		else {
			this.height=0.0;
		}
	}
	public double getHeight() {
		return this.height;
	}
	public double getWidth() {
		return this.width;
	}
	public double getArea() {
		return (this.height*this.width);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Wall wall = new Wall(5,4);
		System.out.println("area= " + wall.getArea());
		 
		wall.setHeight(1.6);
		System.out.println("width= " + wall.getWidth());
		System.out.println("height= " + wall.getHeight());
		System.out.println("area= " + wall.getArea());

	}

}
