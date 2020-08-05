package StringConcept;

public class ReplaceStringWithAnotherString {

	public static void main(String[] args) {


        String str = "Geeks Gor Geeks"; 
  
      
        // Print the original string 
        System.out.println("Original String = "+ str); 

       int stringLen =  str.indexOf('G', 9);
       System.out.println("Index of 9 is::"+stringLen);
        
       StringBuilder string = new StringBuilder(str); 
       string.setCharAt(6, 'm'); 
       
       
       String s1 =  str.replaceAll("G", "m");
       System.out.println(s1);
  
        // Print the modified string 
       System.out.println("Modified String ="+ string); 
        
        	
        
    
		
		
		
	}

}
