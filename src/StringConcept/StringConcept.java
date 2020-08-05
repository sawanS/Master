package StringConcept;

public class StringConcept {

	public static void main(String[] args) {
		
		//why string is immutable??
				
		// When we are creating two string with same value then it will refer the same value in string pool.
		// It will not create any duplicate value in the string pool.
		// if we are changing the value of s1 then it will refer current object from string pool. 
		// we can change the refrence but we can not change the value. If we are trying to change the value
		// string then it will change the refrence for other object also.
		
		
		String s1 = "sawan";
		String s2 ="sawan";
		s2 = "Sharma";
		System.out.println(s1);
		System.out.println(s2);
		
		// when we are creating the object of string and if we are trying to perform any operation on existing object then
		// this behaviour is knownn as immutability.
		 
		String s3 = new String("Mangesh");
		s3.concat("Puri");
		System.out.println("String is:"+" "+s3); // We cannot perform any operation on existing string that is why string is immutable.
		
		StringBuffer s4 = new StringBuffer("Ashutosh");
		s4.append("software");
		System.out.println("StringBuffer is::"+" "+s4); // it will print Ashutosh software 
	}
}


/*
Java String Methods

String charAt()
String compareTo()
String concat()
String contains()
String endsWith()
String equals()
equalsIgnoreCase()
String format()
String getBytes()
String getChars()
String indexOf()
String intern()
String isEmpty()
String join()
String lastIndexOf()
String length()
String replace()
String replaceAll()
String split()
String startsWith()
String substring()
String toCharArray()
String toLowerCase()
String toUpperCase()
String trim()
String valueOf()

*/


/*	String Buffer                                                    String Builder

* 1. It is synchronized and thread safe
* (only one thread is allowed at a time). 						1. It is not synchronized and not thread safe 
 																   (only one thread is allowed at a time).
 
* 2. String buffer is less efficient than String Builder        2. String Builder is more efficient than String Buffer
*
*/

