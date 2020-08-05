package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {


		// Reverse String in ArrayList
		List<String> letters = new ArrayList<String>();
		
		letters.add("Sawan");
		letters.add("Sharma");
		letters.add("ashutosh");
		letters.add("Tripathi");
		
		System.out.println("Before Reverse of List::"+letters);
		Collections.reverse(letters);// this method is used to reverse string or integer value from list.
		
		System.out.println("After Reverse of arraylist::"+letters);
		
		
		//Reverse Integer from ArrayList
		List<Integer> letters1 = new ArrayList<Integer>();
		
		letters1.add(1);
		letters1.add(2);
		letters1.add(3);
		letters1.add(4);
		
		System.out.println("Before Reverse of List::"+letters1);
		Collections.reverse(letters1);
		
		System.out.println("After Reverse of arraylist::"+letters1);
		
		
		
	}

}
