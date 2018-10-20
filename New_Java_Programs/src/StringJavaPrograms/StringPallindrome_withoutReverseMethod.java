package StringJavaPrograms;

import java.util.Scanner;

public class StringPallindrome_withoutReverseMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz enter a valid string ");
		String inputByUser = sc.nextLine();
		String rev = "";
		char[]inputBYuser = inputByUser.toCharArray();
		if(inputBYuser.length>0) {
			for(int i = inputBYuser.length-1 ; i>=0 ; i--) {
				rev = rev+inputBYuser[i];
			}
		}
		else {
			System.out.println("Plz enter a valid string ");
		}
		if(rev.equals(inputByUser)) {
			System.out.println("Given String is pallindrome.");
		}
		else {
			System.err.println("Sorry Given string is not pallindrome");
		}
	}

}
