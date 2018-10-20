package Conceptual_program;

public class Simple_Inheritance {
	public static void main(String[] args) {
		Subclass obj = new Subclass();
		obj.showmsgSub();
		obj.showmsgSuper();
	}
}

class Superclass{
	
	void showmsgSuper() {
		System.out.println(" I m From super class");
	}
	
}
class Subclass extends Superclass{
	void showmsgSub() {
		System.out.println(" I m From Sub class");
	}
}