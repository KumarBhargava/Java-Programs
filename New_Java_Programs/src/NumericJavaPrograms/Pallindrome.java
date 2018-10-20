package NumericJavaPrograms;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		

		//Taking the input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check for the Pallindrome");
		int inputByUser = sc.nextInt();
		
		//Input number to be checked for the pallindrome.
		System.out.println("The number to be checked for the pallindrome is "+inputByUser);
		
		//closing the input stream.
		sc.close();
		
		//Copy the input number to a temp variable to keep original value safe.
		int temp = inputByUser;
		int rev = 0;
		
		//Checking if the number is negative or Positive
		if(temp < 0) {
			System.err.println("This is a negative Number , plz go for a positive number");
			System.exit(1);
		}
		
		//Check if the number is single digit only
		else if(temp > 0 && temp < 9) {
			System.err.println("This is a single digit number , so it is a pallindrome");
			System.exit(1);
		}else {
			while (temp > 0) {
				
				//Extracting last digit of a number
				int rem = temp%10;
				
				// forming a number
				rev = rev*10+rem;
				
				// removing the last digit of a number
				temp = temp/10;
			}
			System.out.println("Number entered by the user"+inputByUser);
			System.out.println("Reversed Number is "+rev);
			if(rev==inputByUser) {
				System.out.println("Number entered by the user is pallindrome numnber");
			}
			else {
				System.out.println("Number entered by the user is not a pallindrome number");
			}
		}
		
		
	}

}
