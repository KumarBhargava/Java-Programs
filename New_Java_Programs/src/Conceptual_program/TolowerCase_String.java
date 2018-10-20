package Conceptual_program;

import java.util.Scanner;

public class TolowerCase_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz enter a string ");
		String Original_string = sc.nextLine();
		
		//we are calling  the method with the parameter. 
		
		LowerCase(Original_string);
		
	}
	
	public static String LowerCase(String Original_string) {
		
		// What ever operation we want to do we will do in the method part
		
		String Changed_string = Original_string.toLowerCase();
		System.out.println("Original String is "+Original_string);
		System.out.println("Changed String is "+Changed_string);
		return Original_string;
		
	}

}
