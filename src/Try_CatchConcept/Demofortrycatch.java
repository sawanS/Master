package Try_CatchConcept;

import java.io.IOException;

public class Demofortrycatch 
{
	public static void main(String[] args) {
		
	
		int a  =10;
		int b;
	try
	{
		b=a/10;
		
		System.out.println("Try block");
	}
	
	catch(Exception e)
	{
		System.out.println("Catch Block");
		
	}
	
	finally
	{
		System.out.println("Finally Block");
	}
	}
}
