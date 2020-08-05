package ConceptofExcept;

public class Conceptofexception1 {

	
	//two ways to handle the exceptions
	// 1. using throws keyword
	// 2. using try catch block
	// to raise an exception you need to use "throw new exception name()"
		
	public static void main(String[] args) throws Exception
	{
		try{
			System.out.println("Base class method");
			
			
		}
		catch(Exception e)
		{
			System.out.println("Arithmetic Exceptions::"+e);
			throw new ArithmeticException();
		}
			
	}

}
