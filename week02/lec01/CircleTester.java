
public class CircleTester {

	public static void main(String[] args) {
		Circle c1 = new Circle(4);
		Circle c2 = new Circle(5);
		Circle c3 = new Circle(1,2,6,8);
		
		System.out.println("Area of c1: " + c1.getArea());
		System.out.println("Area of c2: " + c2.getArea());
		System.out.println("Area of c3: " + c3.getArea());
		
		c2.setRadius(7);
		
		System.out.println("Radius of c3 is " + c3.getRadius());
		
		System.out.println("Area of c2: " + c2.getArea());
	}

}
