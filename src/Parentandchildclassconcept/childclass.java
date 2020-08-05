package Parentandchildclassconcept;

public class childclass extends parentclass {
	
	public void test1()
	{
		System.out.println("Child class method");
	}
	
	

	
	public static void main(String[] args) {
		  // By using child reference, we can call both parent and child class methods
		  // By using Parent reference, we can call only parent class methods, not child class methods.
		  

		parentclass ob = new childclass(); // By using Parent reference, we can call only parent class methods, not child class methods.
		ob.test(); //parent class method
				
		childclass ob1 = new childclass(); //  // By using child reference, we can call both parent and child class methods
		ob1.test(); //parent class method
		ob1.test1(); //child class method
		
	}

}
