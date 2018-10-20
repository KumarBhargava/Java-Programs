package NumericJavaPrograms;

import java.util.Scanner;

public class Area_of_Circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the radius of the circle ");
		
		//Declearation of variables
		
		double radius = sc.nextDouble();
		double pi = 3.141;
		
		//Calling of methods with arguments
		
		calculationOfArea(pi , radius);
	}
	
	//Method 
	public static  void calculationOfArea(double pi , double radius) {
		
		// Operations
		
		double area = pi*radius*radius;
		System.out.println("Area of the Circle is "+area);
	}
}
