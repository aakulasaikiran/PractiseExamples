import java.util.*;

public class NthHighestElement {

	public static void main(String[] args) {
		System.out.println("Please Enter Array length :");
		Scanner scn1 = new Scanner(System.in);
		int nl = scn1.nextInt();
		System.out.println("Please Enter Array Elements");
		Scanner scn2 = new Scanner(System.in);
		int[] a = new int[nl];
		for (int i = 0; i < nl; i++) {
			a[i] = scn2.nextInt();
		}

		System.out.println("Please Enter Which Highest Element You find : :");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		// int[] a = new int[] { 10, 20, 90, 45, 23, 18, 46, 13, 16 };
		Test t = new Test();

		System.out.println("the " + n + "th Highest Element is :" + t.getNumber(a, n));

	}

}
