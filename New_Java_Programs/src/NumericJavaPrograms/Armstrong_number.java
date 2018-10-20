package NumericJavaPrograms;

import java.util.Scanner;

public class Armstrong_number {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Plz enter a number to check for Armstrong ");
		int inputByuser = sc.nextInt();
		int temp = inputByuser;
		int temp2 = temp;
		int sum = 0;
		int count = 0;
		while (temp !=0) {
			temp = temp/10;
			count++;
			
		}
		while(temp2 != 0) {
			
			int rem = temp2%10;
			sum = sum+(int) (Math.pow(rem, count));
			temp2 = temp2/10;
			
		}
		if(inputByuser==sum) {
			System.out.println("Input number is a armstrong number ");
		}
		else {
			System.out.println("Input number is not a armstrong number ");
		}
		
	}

}
