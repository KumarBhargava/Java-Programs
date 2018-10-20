package NumericJavaPrograms;

import java.util.Scanner;

public class Arithmatic_operation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz enter an integer value ");
		int a = sc.nextInt();
		System.out.println(" Plz enter a float value ");
		float b = sc.nextFloat();
		System.out.println("Plz enter an double value ");
		double c = sc.nextDouble();	
		sum_all(a , b , c);
	}
	public static void sum_all(int a, float b, double c) {
		int sum = (int) (a+b+c);
		System.out.println("Sum of int , float , double is "+sum);
	}

}
