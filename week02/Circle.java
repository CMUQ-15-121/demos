
public class Circle {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double x1, double y1, double x2, double y2) {
		double width = Math.abs(x2 - x1);
		double height = Math.abs(y2 - y1);
		this.radius = Math.min(width, height)/2;
	}
	
	public double getDiameter() {
		return this.radius * 2;
	}
	
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
}
