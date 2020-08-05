package StringConcept;


public class FinalizeConcept {
	
		// 1. Final:: It is a keyword. If class declared as final then it can not be inherited, if method is declared as final then it cannot be override 
		//	  and if a variable is declared as final then it can not be changed. 
		// 2. Finally:: it is a block which will be executed whether exception is handled or not. 
	 	// 3. Finalize::it is method which is used to clean up the code before obejct gets garbage collected.
	
		public void finalize()
		{
			System.out.println("Finalize method called");
		
		}  
		
		public static void main(String[] args)
		{  
			
		FinalizeConcept f1=new FinalizeConcept();  // Creating 1st object for class
		FinalizeConcept f2=new FinalizeConcept();  // Creating 2nd object for class
		
		f1=null;  
		f2=null;  // both (f1 and f2) objects are blank
		
		System.gc();  // calling garbage collector because it will destroy all the blank objects as no reference to these objects.
		}
		  
}
