
public class LineCircleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LineSegment mySegment = new LineSegment(3, 3, 5, 10);
		System.out.println(mySegment);
		System.out.println("Line length: " + mySegment.segmentLength());
		Circle newCircle = mySegment.convertToCircle();
		System.out.println(newCircle);
		double area = newCircle.getArea();
		System.out.println("Area of circle: " + area);
	}

}
