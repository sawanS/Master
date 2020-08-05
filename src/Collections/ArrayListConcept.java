package Collections;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;



public class ArrayListConcept {

	public static void main(String[] args) {


		// Array list uses dynamic array to store the elements.
		// Maintains the insertion order 
		// allows duplicates value. 
		// Array list is a class which implements list interface.
		
		
		ArrayList ar = new ArrayList(); 
		
		
		ar.add("Sawan");
		ar.add("Sawan");
		ar.add(10);
		ar.add("Sawan");
		ar.add(10);
		
		
		System.out.println("Total Size of array is: "+ar.size());
		
		System.out.println("Total Array list is: ");
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		
	

	}

}
