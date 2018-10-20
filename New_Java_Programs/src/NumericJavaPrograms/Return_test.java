package NumericJavaPrograms;

import java.util.Scanner;

public class Return_test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enetr two numbers ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		simpleSum(a , b);
		
		
		//Return_test test = new Return_test();
		//test.simpleSum(a , b);
		
	}
	public static void simpleSum(int a , int b) {
		 
		System.out.println("Before return Value of a is "+a +" and b is "+b);
		int sum = a+b;
		System.out.println("Sum of two numbers is "+sum);
		 
		
	}

}
