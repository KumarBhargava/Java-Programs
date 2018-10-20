package Conceptual_program;

import java.util.Scanner;

public class ForEachLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//Taking the size of array from the user
		
		System.out.println("Plz enter the size of Array ");
		int size = sc.nextInt();
		int [] numbers = new int [size];
		
		//Taking the input of array from the user
		
		System.out.println("plz enter the elements of array ");
		for(int i = 0 ; i < size ; i++) {
			numbers[i] = sc.nextInt();
		}
		
		//For each loop concept for printing the numbers
		
		for (int digits : numbers) {
			
			System.out.println("Elements in the arrays are "+digits);
		}
	}

}
