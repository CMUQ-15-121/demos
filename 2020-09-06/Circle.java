
public class Circle {
	private double radius;
	private double cx;
	private double cy;

	public Circle(double radius, double cx, double cy) {
		this.radius = radius;
		this.cx = cx;
		this.cy = cy;
	}

	public double getArea() {
		double area;
		area = Math.pow(this.radius, 2) * Math.PI;
		return area;
	}

	public String toString() {
		return "Circle of radius " + this.radius + " at center (" + this.cx + "," + this.cy + ")";
	}

	public static void main(String[] args) {
		Circle c = new Circle(8, 1.5, 1.1);
		System.out.println(c);
		System.out.println("Area is " + c.getArea());
	}
}
