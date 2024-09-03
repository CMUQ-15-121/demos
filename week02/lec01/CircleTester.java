
public class CircleTester {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		Circle otherCircle = new Circle(1, 1, 5, 8);
		System.out.println(c.getArea());
		System.out.println(otherCircle.getArea());
		c.setRadius(10);
		System.out.println(c.getArea());

		System.out.println(c.getSerial());
		System.out.println(otherCircle.getSerial());
	}

}
