
public class Logical {
	public static void main(String args[]) {
		int x = 5, y = 7;

		System.out.println("x<y && x<y:" + (x < y && x < y));
		System.out.println("x<y && x>y:" + (x < y && x > y));
		System.out.println("x>y&&x<y:" + (x > y && x < y));
		System.out.println("x>y&&x>y:" + (x > y && x > y));

		System.out.println("x<y || x<y:" + (x < y && x < y));
		System.out.println("x<y || x>y:" + (x < y || x > y));
		System.out.println("x>y||x<y:" + (x > y || x < y));
		System.out.println("x>y||x>y:" + (x > y || x > y));

		System.out.println("!(x<y):" + !(x < y));
		System.out.println("!(x>y):" + !(x > y));
	}
}
