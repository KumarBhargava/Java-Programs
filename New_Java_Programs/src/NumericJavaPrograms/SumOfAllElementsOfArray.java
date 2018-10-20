package NumericJavaPrograms;

import java.util.Scanner;

public class SumOfAllElementsOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		//Taking the size of Array from the user
		
		System.out.println("Plz enter the size of Array");
		int n = sc.nextInt();
		int[] number = new int[n];
		
		//Taking the input from the user
		
		System.out.println("plz enter the Elements of Array ");
		for(int i = 0 ; i < n ; i++) {
			number[i] = sc.nextInt();
		}
		
		//Sum of all the Elements of the Array
		for(int digits : number) {
			 sum = sum + digits;
		}
		System.out.println("Sum of all the Elemets of an array is "+sum);
		
	}

}
