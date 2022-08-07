
public class CircleTester {

	public static void main(String[] args) {
		Circle c1 = new Circle(4);
		Circle c2 = new Circle(4);
		Circle c3 = c1;
		
		System.out.println("c1 area is " + c1.getArea());
		System.out.println("c2 area is " + c2.getArea());
		System.out.println("c3 area is " + c3.getArea());
		
		c1.setRadius(5);
		
		System.out.println("c1 area is " + c1.getArea());
		System.out.println("c2 area is " + c2.getArea());
		System.out.println("c3 area is " + c3.getArea());
		
		Circle c4 = new Circle(1,2,6,8);
		System.out.println("c4 area is " + c4.getArea());

		//System.out.println(Circle.getArea());
		
		
	}

}
