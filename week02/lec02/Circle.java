// Maintainer: Ryan Riley

public class Circle {
	private double radius;
	private static int numCircles = 0;

	public Circle(double r) {
		this.radius = r;
		this.numCircles++;
	}

	public Circle(double x0, double y0, double x1, double y1) {
		double d = Math.sqrt(Math.pow(y1 - y0, 2) + Math.pow(x1 - x0, 2));
		this.radius = d / 2;
		this.numCircles++;
	}

	public static int getNumCircles() {
		return numCircles;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Brainstorm: Area, Circumference, Diameter
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
}
