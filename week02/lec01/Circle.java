
public class Circle {

	// Fields / Instance Variables / Attributes
	private double radius;
	// double x;
	// double y;
	// String color;
	// String name;
	private int serial;
	private static int num;

	// Constructor
	public Circle(double r) {
		this.radius = r;
		this.serial = Circle.num++;
	}

	public Circle(double x1, double y1, double x2, double y2) {
		this.radius = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		this.serial = Circle.num++;
	}

	// Methods: Things done to this or by this, etc
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	
	public void setRadius(double r) {
		this.radius = r;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public int getSerial() {
		return this.serial;
	}

}
