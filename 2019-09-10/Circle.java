
public class Circle {
	
	private int radius;
	private int x;
	private int y;
	
	// 1
	public Circle(int radius, int x, int y) {
		this.radius = radius;
		this.x = x;
		this.y = y;
	}
	
	// 2
	public Circle(int radius) {
		this(radius, 0, 0);	
	}

	public Circle(int radius, int x) {
		this(radius, x, 0);
	}
	
	public double area() {
		return Math.PI * this.radius * this.radius;
	}
	
	public double area(int multiplier) {
		return area() * multiplier;
	}
	
	public double circumference() {
		return 2 * Math.PI * this.radius;
	}
	
	public static void main(String[] args) {
		// Test cases for circle
	}

}
