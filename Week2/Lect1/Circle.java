
public class Circle {

	private double radius;
	//private double diameter;
	double x;
	double y;
	
	
	public Circle(double radius) {
		this.radius= radius; // self in Python
		//double z = 3*this.radius;
	}
	
	
	public Circle(double x1, double y1, double x2, double y2) {
		double width = Math.abs(x2-x1);
		double height = Math.abs(y2-y1);
		this.radius = Math.min(width, height)/2;
	}
	
	public double getDiameter() {
		return this.radius*2;
		//return this.diameter;
	}
	
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	
	public double getRadius() {
		return this.radius;
		//return this.diameter/2;
	}
	
	public void setRadius( double r) {
		
		if(r > 0) {
			this.radius= r;
		}
		
		//this.diameter = r*2;
		
		
	}
	


}
