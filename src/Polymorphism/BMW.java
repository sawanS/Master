package Polymorphism;

public class BMW extends Car {
	
	
	
	public void seat()
	{
		System.out.println("Sub class== seat method");
	}
	
	
	//polyomrphism means different forms
	// a single class object can refer super class or child class based on the reference type. This is called "Polymorphism".

	public static void main(String[] args) {
		
		//calling method using parent class object
		Car c = new Car();  
		c.seat(); // parent class seat method
		c.tyre(); // parent class tyre method
		
		System.out.println("***************************");
		
		//calling method using base class object
		// Method overloading is the example for compile time polymorphism
		BMW b = new BMW();//This is called compile time polymorphism or static polymorphism
		b.seat(); //print Base class seat method
		b.tyre(); // print parent class tyre method
	
		
		System.out.println("***************************");
		
		
		// calling method using parent class reference object
		// Method Overriding is the runtime polymorphism.
		Car c1 = new BMW();  ////This is called run time polymorphism or dynamic polymorphism
		  c1.seat(); //print Base class seat method
		  c1.tyre(); //print parent class tyre method
		 
		  
		  
		  // By using child reference, we can call both parent and child class methods
		  // By using Parent class object, we can call only parent class methods, not child class methods.
		  
	
}
}