package lect2;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(Circle.getRadius());
		
		Circle.a=10;
		System.out.println(Circle.a);
		
		Circle c1 = new Circle(3.4);
		Circle c2= new Circle(5.2);
		System.out.println(c1.a);
		
		c2.a = 7;
		System.out.println(c1.a);
		System.out.println(Circle.a);
	}

}
