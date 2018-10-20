package Conceptual_program;

public class MethodCreation {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		//int sum = 0;
		displayMsg(a , b);
		//System.out.println("Sum of two number is "+sum);
	}
	public static void displayMsg(int a, int b) {
		
		System.out.println(" Hi i am in DisplayMsg Method");
		 int sum = a + b;
		 System.out.println("Sum of two numbers are "+sum);
		
	}

}
