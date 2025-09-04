
public class StaticDemo {

	public static void main(String[] args) {
		// System.out.println(Circle.getRadius());
		System.out.println(Circle.a);
		Circle c1 = new Circle(1);
		Circle c2 = new Circle(2);
		System.out.println(c1.a);
		System.out.println(c2.a);
		c1.a = 6;
		System.out.println(Circle.a);
		System.out.println(c1.a);
		System.out.println(c2.a);
	}

}
