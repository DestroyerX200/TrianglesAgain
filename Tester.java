public class Tester {
	public static void main(String[] args) {
		Point A = new Point(0, 0);
		Point B = new Point(3, 4);
		Point C = new Point(0, 0);
		System.out.println(A.distanceTo(B));
		System.out.println(A.equals(B));
		System.out.println(A.equals(C));
    }
}
