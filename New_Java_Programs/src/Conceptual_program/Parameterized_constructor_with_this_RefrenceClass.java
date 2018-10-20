package Conceptual_program;

class Circle {
	
	private double radius; 
	
	// Creating a contructor
	
	Circle()
	{
		radius = 0.0;
	}
	Circle(double radius)
	{
		this.radius = radius;
	}
	
	//Creating a method area
	public double area()
	{
		return 3.14*radius*radius;
	}	
}

public class Parameterized_constructor_with_this_RefrenceClass {
	public static void main(String[] args) {
		Circle c1 = new Circle(10);
		System.out.println("Area of Circle : "+c1.area());
	}

}
