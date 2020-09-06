
public class LineSegment {
	private double x1, y1;
	private double x2, y2;

	public LineSegment(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public String toString() {
		return "LineSegment from (" + this.x1 + "," + this.y1 + ") to (" + this.x2 + "," + this.y2 + ")";
	}

	public double segmentLength() {
		double ret = Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2));
		return ret;
	}

	public Circle convertToCircle() {
		Circle ret = new Circle(this.segmentLength(), this.x1, this.y1);
		return ret;
	}
	
	public static void main(String[] args) {
		LineSegment mySegment = new LineSegment(3, 3, 5, 10);
		LineSegment myOtherSegment = new LineSegment(1, 2, 9, 3);
		System.out.println(mySegment);
		System.out.println("Length of mySegment: " + mySegment.segmentLength());
		System.out.println(myOtherSegment);
		double theLength = myOtherSegment.segmentLength();
		System.out.println("Length of myOtherSegment: " + theLength);
	}
}
