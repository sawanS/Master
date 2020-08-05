package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {
		
		// Set is interface which extends collection interface.
		// does not allow duplicates
		// Unorderd and Unsorted
		// allow uniqueness
		// it does not maintain insertion order
		
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(11);
		set.add(21);
		set.add(10);
		set.add(1);
		set.add(1);
		System.out.println("Set:"+set);
	
		// Tree set is a class which implements sortedset interface.
		// it does not allows duplicates
		// it allows sorted values 
		// allow uniqueness
		// does not maintain insertion order
		
		TreeSet<Integer> set11 = new TreeSet<Integer>(set);
/*		set11.add(1);
		set11.add(21);
		set11.add(10);
		set11.add(11);
*/		
		System.out.println("Tree Set::"+set11);
		
	}
	
}
