
public class Circle {
	// Field or instance variable
	private double radius;
	
	// Constructor
	public Circle(double r) {
		if (r <= 0) {
			// This is good
			throw new IllegalArgumentException("r must be greater than or equal to 0");
		}
		this.radius = r;
	}
	
	// Different constructor
	public Circle(double x0, double y0, double x1, double y1) {
		double d = Math.sqrt(Math.pow(y1-y0,2) + Math.pow(x1-x0, 2));
		this.radius = d/2;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double r) {
		this.radius = r;
	}
	
	// Method
	public double getArea() {
		return Math.PI * (this.radius) * (this.radius);
	}
}
