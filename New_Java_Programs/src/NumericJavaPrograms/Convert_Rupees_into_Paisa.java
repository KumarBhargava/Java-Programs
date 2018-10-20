package NumericJavaPrograms;

import java.util.Scanner;

public class Convert_Rupees_into_Paisa {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz enter the amount in rupees");
		double amount = sc.nextInt();
		conversion(amount);
	}
	public static void conversion(double amount) {
		double paisa = amount*100;
		System.out.println("So total paisa is "+paisa);
	}

}
