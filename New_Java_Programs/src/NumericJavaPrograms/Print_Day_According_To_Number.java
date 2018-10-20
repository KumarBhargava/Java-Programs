package NumericJavaPrograms;

import java.util.Scanner;

public class Print_Day_According_To_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("plz Enter the day in number ");
		int day = sc.nextInt();
		DayName(day);
	}
	public static void DayName(int day) {
		if(day==1) {
			System.out.println("This is Monday ");
		}else if(day == 2) {
			System.out.println("This is Tuesday");
		}else if(day == 3) {
			System.out.println("This is Wednesday");
		}else if(day == 4) {
			System.out.println("This is Thursday");
		}else if(day == 5) {
			System.out.println("This is Friday");
		}else if(day == 6) {
			System.out.println("This is saturday");
		}else if(day == 7) {
			System.out.println("This is Sunady");
		}else {
			System.err.println("Plz enter a valid day..");
		}
		
	}

}
