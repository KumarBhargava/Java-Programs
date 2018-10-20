package NumericJavaPrograms;

public class EvenOddUsingSwithCase {
	public static void main(String[] args) {
		for(int i = 0 ; i <=10;i++) {
			switch(i) {
			case 1:
			case 3:
			case 5:
			case 7:
				System.out.println(i+"- odd numbers ");
				break;
			case 2:
			case 4:
			case 6:
			case 8:
			case 10:
				System.out.println(i+" -Even numbers ");
			}
		}
		System.out.println("The End ");
	}

}
