public class Triangle{

	private Point v1, v2, v3;

	public Triangle(Point a, Point b, Point c) {
		v1 = a;
		v2 = b;
		v3 = c;
	}
	public Triangle(double x1, double y1,double x2, double y2,double x3, double y3) {
		v1 = new Point(x1, y1);
		v2 = new Point(x2, y2);
		v3 = new Point(x3, y3);
	}
	public double getPerimeter() {
		double side1, side2, side3;
		side1 = this.v1.distanceTo(this.v2);
		side2 = this.v1.distanceTo(this.v3);
		side3 = this.v2.distanceTo(this.v3);
		return side1 + side2 + side3;
	}

	public double getArea() {
		double side1, side2, side3, s;
		side1 = this.v1.distanceTo(this.v2);
		side2 = this.v1.distanceTo(this.v3);
		side3 = this.v2.distanceTo(this.v3);
		s = this.getPerimeter() / 2.0;
		return Math.sqrt( s*(s-side1)*(s-side2)*(s-side3) );
	}
	// public String classify() {

	// }
	// public String toString() {

	// }
}