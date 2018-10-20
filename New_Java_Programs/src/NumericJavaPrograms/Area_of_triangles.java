package NumericJavaPrograms;

import java.util.Scanner;

public class Area_of_triangles {

	public static void main(String[] args) {
		
		double area , a , b , c, s ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz enter the value of a");
		 a = sc.nextInt();
		 System.out.println("Plz enter the value of b");
		 b = sc.nextInt();
		 System.out.println("Plz enter the value of b");
		 c = sc.nextInt();
		 s = (a+b+c)/2;
		 AreaOfTriangle(s, a, b, c);
	}
	public static void AreaOfTriangle(double s , double a , double b , double c ) {
		
		 double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		 System.out.println("Area of Triangle = "+area);
		
	}

}
