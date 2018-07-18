import java.util.Arrays;

public class Test {
	public int getNumber(int[] a, int n1) {
		int length = a.length;

		for (int i = 0; i < length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		Arrays.sort(a);
		
		for (int i = 0; i < length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");
		return (a[length - n1]);
	}

}
