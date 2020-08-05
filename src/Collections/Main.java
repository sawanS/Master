package Collections;

import java.util.LinkedList;

public class Main {

	
	public static void main(String[] args) {
		
		
		LinkedList<String> lll = new LinkedList<String>(); // Maintains the insertion order 
														   // and does not allow duplicates value. doesn't allow sorted values.
		lll.add("Sawan");								   // It is good for manipulation of data.
		lll.add("apple");								   // It uses doubly linked list to store the elements.
		lll.add("Ball");								   // It implements both list and Deque interface.
		lll.add("Cat");
		
		System.out.println(lll);
		
		
		
	}
}
