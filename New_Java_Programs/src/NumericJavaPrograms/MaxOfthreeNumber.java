package NumericJavaPrograms;

import java.util.Scanner;

public class MaxOfthreeNumber {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Plz enter the value of a ");
		int a = sc.nextInt() ;
		System.out.println("Plz enter the value of b");
		int b = sc.nextInt() ;
		System.out.println("Plz enter the value of c ");
		int c = sc.nextInt() ;
		int max = 0 ;
		if(a > b) {
			if(a > c) {
				max = a ;
				//System.out.println(max);
			}else {
				max = c ;
				//System.out.println(max);
			}
		}else {
			if(b > a) {
				if (b > c) {
					max = b ;
					//System.out.println(max);
				}else {
					max = c;
					//System.out.println(max);
				}
			}
		}
		System.out.println("Maximum number is "+max);
	}
}
