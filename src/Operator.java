import Collections.Main;

public class Operator {
	
	public static void main(String[] args) {
		
		
		// == operator is used for reference comparison and equals method is used for content comparison.
		// in the below ex, the objects are different but content is same.
		// You can also compare two strings using == operator. But, it compares references of the given variables not values.
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); // true
		
		
		System.out.println("**********==========************");
		// In this ex, Both the variables are reffering to the same content.
		
		String s3 = "ECW"; //true
		String s4 = "ECW"; // true
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
	}

}
