package StringJavaPrograms;

import java.util.Scanner;

public class StringPallindrome_withReverseMethod {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Plz Enter a valid string ");
			String inputByuser = sc.nextLine();
			
			//Converting string into StringBuilder
			StringBuilder strOriginal = new StringBuilder(inputByuser);
			
			//Reversing the string 
			StringBuilder revString = new StringBuilder(strOriginal).reverse();
			
			//since stringBuildr/Buffer do not override equals method so it will not check content
			
			//To verify content we can use valueOf method of String class. This method class toString() internally.
			
			if (String.valueOf(strOriginal).equals(String.valueOf(revString))) {
				System.out.println("Result :: Palindrome ");
			}
			else {
				System.out.println("Result :: Not Palindrome ");
			}
			
			//Other way to verify the Equality of the String is below.
			
			if(strOriginal.toString().equals(revString.toString())) {
				System.out.println("Result :: Palindrome ");
			}else {
				System.out.println("Result :: Not a palindrome");
			}
			
			//Other way 
			if(strOriginal.toString().compareTo(revString.toString())==0) {
				System.out.println("Result palindrome");
			}else {
				System.out.println("Result Not palindrome .");
			}
		}
}
