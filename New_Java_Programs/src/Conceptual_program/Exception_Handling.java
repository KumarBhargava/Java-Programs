package Conceptual_program;

public class Exception_Handling {
	public static void main(String[] args) {
		int d , a;
		try {
			d = 0;
			a = 10 / d;
			System.out.println("This will not get printed");
		}catch(ArithmeticException e){
			
			System.out.println("Division by zero , Arithmatic eception ");
		}
		System.out.println("After catch exception ");
		
	}

}
