package NumericJavaPrograms;

import java.util.Scanner;

public class SwapTwoNumbersWithoutUsing_ThirdVariable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz enter two numbers :");
		int a= sc.nextInt();
		int b= sc.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(" Two numbers after swapping :"+a +","+b);
	}

}
