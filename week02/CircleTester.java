
public class CircleTester {

	public static void main(String[] args) {
		Circle c1 = new Circle(3.0);
		
		Circle c2 = new Circle(0, 0, 4, 4);

		System.out.println(c1.getRadius());
		System.out.println(c1.getDiameter());
		System.out.println(c1.getArea());
		
		System.out.println(c2.getArea());
		
		Circle c3 = new Circle(4.0);
		System.out.println(c3.getRadius());
	}

}
