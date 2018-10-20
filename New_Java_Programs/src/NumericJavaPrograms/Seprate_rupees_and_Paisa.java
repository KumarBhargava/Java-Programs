package NumericJavaPrograms;

import java.util.Scanner;

public class Seprate_rupees_and_Paisa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz enter the amount ");
		double amount = sc.nextDouble();
		Calculation(amount);
		CalculationofRupeesandPaisa (amount);
		
	}
	public static void Calculation(double amount) {
		double Totalpaisa = amount*100;
		System.out.println("So total paisa is "+Totalpaisa);
	}
	public static void CalculationofRupeesandPaisa(double amount) {
		int Rupees = (int) amount;
		double Paisa1 = (amount-Rupees)*100;
		double Paisa = Math.round(Paisa1);
		System.out.println("Total Amount of Rupees "+Rupees + " and Paisa "+Paisa);
		
	}

}
