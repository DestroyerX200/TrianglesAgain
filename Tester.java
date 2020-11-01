public class Tester {
	public static void main(String[] args) {
		Point a = new Point(0, 0);
		Point b = new Point(3, 4);
		Point c = new Point(0, 0);
		System.out.println(a.distanceTo(b));
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));

		System.out.println(); //defining triangles and getPerimeter testcases

		Point d = new Point(0 , 4);
		Triangle x = new Triangle(a, b, d); // perimeter = 12; area = 6; scalene
		Triangle y = new Triangle(-5, 0, 9, 0, 0, 12); // perimeter = 42; area = 84; scalene
		Triangle z = new Triangle(1, 0, -1, 0, 0, Math.sqrt(3)); // perimeter = 6; area = sqrt(3); equilateral
		Triangle alpha = new Triangle(0, 3, 0, -3, 4, 0); // perimeter = 16; area = 12; isosceles
		
		System.out.println(x.getPerimeter());
		System.out.println(y.getPerimeter());
		System.out.println(z.getPerimeter());
		System.out.println(alpha.getPerimeter());

		System.out.println(); //getArea test cases

		System.out.println(x.getArea());
		System.out.println(y.getArea());
		System.out.println(z.getArea());
		System.out.println(alpha.getArea());

		System.out.println();

		System.out.println(x.classify());
		System.out.println(y.classify());
		System.out.println(z.classify());
		System.out.println(alpha.classify());
    }
}
