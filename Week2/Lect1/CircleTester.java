
public class CircleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Circle c1 = new Circle(); //object of circle class
		//Circle c2 = new Circle();
		
		Circle c1 = new Circle(3.4);
		
		System.out.println(c1.getRadius());
		System.out.println(c1.x);
		
		c1.x = 2;
		c1.y = 3;
		
		System.out.println(c1.x);
		
		System.out.println(c1.getArea());
		System.out.println(c1.getDiameter());
		
		Circle c2 = new Circle(2.0,5.5,4.4,8.2);
		System.out.println(c2.getRadius());
		c2.setRadius(5);
		
		
	}

}
