package NumericJavaPrograms;

public class Dynamic_initialization_of_variable {
	public static void main(String[] args) {
		double a = 3.0 , b = 4.0;
		/* Dynamic initialization of a variable - Initialization is the process of providing 
		 * value to a variable at declaration time.A variable is initialized once in its life time.
		 *  Any attempt of setting a variable's value after its declaration is called assignment. 
		 *  To use a local variable you have to either initialize or assign it before the variable is first used. 
		 * But for class members, the compulsion is not so strict.If you don't initialize them then 
		 * compiler takes care of the initialization process and set class members to default values.
		 * Java allows its programmers to initialize a variable at run time also. Initializing a variable
		 *  at run time is called dynamic initialization.
		 *  The following piece of code (Dynamic_initialization_of_variable.java) demonstrates it.
		 * 
		 */
		
		double c = Math.sqrt(a*a+b*b);
		System.out.println("Hypotenuse is "+c);

	}

}
