package Collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class Hashtable1 {


	public static void main(String[] args) {
		
		// HashTable is a class which implements map interface.
		// it stores the element in key-val pair
		// it is synchronized and thread safe means more than one thread is allowed at a time.
		// it allows duplicates values
		// Null is not allowed in hashtable
		// Enumerator is used to iterate the values.
		// it does not maintain insertion order.
		
		
		Hashtable<Integer, String> h = new Hashtable<>();
		h.put(1, "Selenium");
		h.put(2, "java");
		h.put(3, "C++");
		h.put(4, "C++");
		System.out.println(h);
		
		Hashtable<Integer, String> h1 = new Hashtable<>();
		h1 = (Hashtable) h.clone();
		System.out.println("Values from h::"+h);
		System.out.println("Values from h1::"+h1);
		
		System.out.println("Before clear h1::"+h1);
	
		h1.clear();
		System.out.println("After Clear h1::"+h1);
		
		
		//Contains Value::
		Hashtable h3 = new Hashtable();
		h3.put("1", "Selenium");
		h3.put("2", "java");
		h3.put("3", "Selenium");
		
		if(h3.containsValue("C++"))
		{
			System.out.println("Both are Equal");
		}
		
		//print all the values using Enumeratioin - elements()::
		Enumeration e = h3.elements();
		System.out.println("Print all the values using elements::");
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		//Print all the values using entryset::
		Set s = h3.entrySet();
		System.out.println("Print all the values using entry set::"+s);
		
		
		// Check both Hashtables are equal or not::
		Hashtable h4 = new Hashtable();
		h4.put("1", "Selenium");
		h4.put("1", "java");
		h4.put("3", "C++");
		
		
		if(h3.equals(h4))
		{
			System.out.println("Both tables are equal");
		}
		
		//get the value from key
		System.out.println("Value from key::"+h4.get("1"));
		
		
		// get the hashcode from key::
		System.out.println("Hashcode::"+h4.hashCode());
	}
	
}
