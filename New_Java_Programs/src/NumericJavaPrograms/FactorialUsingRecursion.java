package NumericJavaPrograms;

import java.util.Scanner;

public class FactorialUsingRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("plz eneter the number to get the fcatorial ");
		int n = sc.nextInt();
		int f = factorial(n);
		System.out.println("factorial for"+ n + " is "+ f);
	}
	public static int factorial(int n) {
		
		if (n == 0)
			return 1;
		else
			return (n*factorial(n-1));
			
		
	}
		

}
