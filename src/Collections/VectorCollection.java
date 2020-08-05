package Collections;

import java.util.Vector;

public class VectorCollection {

	public static void main(String[] args) {


		Vector<String> vec = new Vector<String>(); // Maintains the insertion order and does not allow duplicates value. doesn't allow sorted values.
		vec.add("Sawan");
		vec.add("Sharma");
		vec.add("ashu");
		vec.add("pose");
		vec.add("10");
		System.out.println(vec);
		
		  // It will remove pose from vector
		System.out.println("Removing Index 4:"+vec.remove(3));
		
		vec.clone(); // It will copy the entire vector
		System.out.println(vec);
		
		
		
		
	}

}
