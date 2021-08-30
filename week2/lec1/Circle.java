
public class Circle {
	private double radius;

	public Circle(double r) {
		this.radius = r;
	}

	public Circle(double x0, double y0, double x1, double y1) {
		double d = Math.sqrt((Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2)));
		this.radius = d/2;
	}

	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
}
