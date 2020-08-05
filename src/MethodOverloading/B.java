package MethodOverloading;

public class B extends A
{

	
	public void age()
	{
		System.out.println("Sub class== age method with no parameter");
		
	}
	
	
	
	public void age(double d)
	{
		System.out.println("Sub class== Age method for double type");
	}
	
	
	
	
	public static void main(String[] args)
	{

			B obj = new B();
			
			obj.age(10.2); // it will call the method which contains the double type parameter.
			obj.age(1); // it will call the method which contains the integer parameter
			obj.age(); // it will call the method will has no parameter
			
			
			
			

	}

}
