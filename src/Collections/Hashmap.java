package Collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Hashmap {

	
	public static void main(String[] args) {
		
		
		// HashMap is class which implements Map interface
		// stores the elements in key value pair
		// It may have one null key and multiple null values
		// it is not synchronized and not thread safe means one thread is allowed at a time.
		// allows duplicates values.
		// It maintains insertion order
		// Iterator is used to iterate the value.
		
		// Sorting HashMap on keys is quite easy, all you need to do is to create a TreeMap by copying entries from HashMap.
		
		HashMap<Integer,String> map = new HashMap<>();
		
		map.put(1, "Selenium");
		map.put(2, "Java");
		map.put(3, "C++");//allows duplicate values
		map.put(4, "Selenium");
		map.put(4, "Selenium");
		System.out.println(map); // printing the whole map
		
		
		System.out.println(map.get(2)); // it will print the value which has key "2"
		
		
		HashMap<Integer,String> map1 = new HashMap<>();
		
		//Iteration using Iterator
		map1= (HashMap)map.clone();
		System.out.println("After Clone to map1::"+map1);
		
		map1.clear();
		System.out.println("After Clear map1::"+map1);
		
 
		// iteration using entry set
		for (Entry m : map.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue() );
			
		}
		
		//get hashcode
		System.out.println("HashCode of map::"+map.hashCode());
		
		
		//Contains
		if(map.containsValue("selenium"))
		{
			System.out.println("Match Found");
		}
		else
		{
			System.out.println("Match not Found");
		}
		
		//check whether both hashmap are equals are not
		HashMap<Integer,String> map2 = new HashMap<>();
		map2.put(1, "Selenium");
		map2.put(2, "Java");
		map2.put(3, "C++");
		
		if(map.equals(map2))
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}
		
	}
	
}
