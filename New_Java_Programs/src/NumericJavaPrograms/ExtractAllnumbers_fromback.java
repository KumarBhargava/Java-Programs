package NumericJavaPrograms;

import java.util.Scanner;

public class ExtractAllnumbers_fromback {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 10;
		
		//Declearing the size of an array
		
		int[] mobno = new int[n];
		System.out.println("Plz enter a mobile number ");
		
		//Taking the input of user from the user
		
		for(int i=0;i<n;i++) {
			mobno[i]= sc.nextInt();	
			
		}
		sc.close();
		
		// For printing the value of the array
		
		for(int digits : mobno) {
			
			System.out.println(digits);
		}
		
		// Passing mobile number as a parameter to the sumOflastFiveDigit
		
		sumOflastFiveDigit(mobno);	
	}
	
	//Passing the argument as array to the method
	
	public static void sumOflastFiveDigit(int[] mobno) {
		
		int digitsum = 0;
		if(mobno.length > 0) {
		for(int i = mobno.length-1 ; i >= 0 ; i--) {
			digitsum = digitsum+mobno[i];
			}
		}
		// Code to add last five digit of a mobile number without array.
		
		/*
		for(int i = 1 ; i<= 5 ; i++) {
		int digit = (int) (mobno%10);
		System.out.println(i+"st Number from back of mobile number is "+digit);
		digitsum = digitsum+digit;
		mobno = mobno/10;
		}
		 */
	System.out.println("Sum of last five digit of mobile number "+digitsum);
}

}
