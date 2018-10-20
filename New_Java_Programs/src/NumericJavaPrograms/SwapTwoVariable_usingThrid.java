package NumericJavaPrograms;

import java.util.Scanner;

public class SwapTwoVariable_usingThrid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Two numbers before swaping are "+a +","+b);
		int temp ;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Two numbers after swaping "+a +","+b);
	}

}
