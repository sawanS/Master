package Interface;


/*Abstract class												Interface
 * 
 * 
 * 
1) Abstract class can have abstract and non-abstract methods.	Interface can have only abstract methods. .
2) Abstract class doesn't support multiple inheritance.			Interface supports multiple inheritance.
3) Abstract class can have final, non-final, static 
and non-static variables.										Interface has only static and final variables.
4) Abstract class can provide the implementation of interface.	Interface can't provide the implementation of abstract class.
5) The abstract keyword is used to declare abstract class.		The interface keyword is used to declare interface.
6) An abstract class can extend another Java class 
and can implement multiple Java interfaces.							interface can extend another Java interface only.


*/

// interface contains 100% abstraction.
// Only method declaration is allowed not the method definition.
// If you want to use the abstract method of interface then you need to define all the method in the child class.


public class IciciBank implements RBI,USBank

{

	
	public void debit()
	{
		System.out.println("RBI--debit");
	}
	
	
	public void credit()
	{
		System.out.println("RBI--Credit");
	}
	
	public void homeLoan()
	{
		System.out.println("USBank--HomeLoan");
	}
	
	public void carLoan()
	{
		System.out.println("USBank--CarLoan");
	}
	
		
	public static void main(String[] args)
	
	{

		IciciBank ic = new IciciBank();
		
		ic.carLoan();
		ic.homeLoan();
		
		ic.credit();
		ic.debit();
		
		System.out.println(RBI.balance);
		
		ic.sum(); //method from Icici class
	}
	
	public void sum()
	{
		System.out.println("IciciBank class method");
	}
	
	
}
