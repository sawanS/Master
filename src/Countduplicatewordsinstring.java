import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class Countduplicatewordsinstring {
	
	
	public static void main(String[] args) {
		
	String text = "sawan";
	String characters = "";
	String duplicates = "";
	
	
	for(int i=0;i<text.length();i++)
	{
		String text1 = Character.toString(text.charAt(i));
		
		if(characters.contains(text1))
		{
			if (!duplicates.contains(text1)) {
				duplicates = duplicates + text1;
				
			}
			
		}
		characters = characters + text1;
		System.out.println(characters);
		
	}
	System.out.println("Duplicate Character::"+duplicates);
	ArrayList<String> letters1 = new ArrayList<String>();
	letters1.add(duplicates);
	Collections.reverse(letters1);
	
	System.out.println(letters1);
	
	}
	
	
	 /*public static void main(String argu[]) {
	      String str = "mominn oo";
	      char[] carray = str.toCharArray();
	      System.out.println("The string is:" + str);
	      System.out.print("Duplicate Characters in above string are: ");
	      for (int i = 0; i < str.length(); i++) {
	         for (int j = i + 1; j < str.length(); j++) {
	            if (carray[i] == carray[j]) {
	               System.out.print(carray[j] + " ");
	               break;
	            }
	         }
	      }
	   }*/
		

}
