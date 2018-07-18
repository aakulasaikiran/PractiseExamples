import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
System.out.println("Enter Any Number for a:");
Scanner scn1=new Scanner(System.in);
	
	int a=scn1.nextInt();
	
	
	System.out.println("Enter Any Number for b:");
	Scanner scn2=new Scanner(System.in);
		
		int b=scn2.nextInt();
		
		System.out.println(a+"+"+b+"="+test2.add(a, b));
		System.out.println("The X values :"+test2.x);

	
	}

}
