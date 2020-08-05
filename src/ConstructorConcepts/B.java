package ConstructorConcepts;

public class B extends Constructordemo {

	B()
	{
		System.out.println("Child class constructor");
	}
	
	public static void main(String[] args) {
		
		
		Constructordemo obj = new Constructordemo(); // calling contructor using parent class object 
													 // o/p: only parent class constructor will be invoked		
		B obj1 = new B(); // calling contructor using Base class object
		
		Constructordemo ob = new B(); // calling constructor using parent class reference object
		
		
	}
}

