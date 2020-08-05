package StringConcept;

public class ReverseString {

	public static void main(String[] args) 
	
	{
		//find the length of string
		// put for loop from length-1 of string.
	
		
		String s = "Sawan";
		
		int len=s.length();
		 
		 
		 String rev ="";
		 
		 //for(int i=s.length()-1;i>=0; i--)
			 for(int i=len-1;i>=0;i--)
		 {
			rev = rev+s.charAt(i);
			
		 }
		 System.out.println("Reverse using for loop::"+rev);
		 
		 //String Buffer
		 
		 StringBuffer bf = new StringBuffer(s);
		 System.out.println("Reverse using string buffer:"+bf.reverse());
		 
		 
		 	
	}

}
