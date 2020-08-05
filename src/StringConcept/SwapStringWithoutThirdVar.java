package StringConcept;

public class SwapStringWithoutThirdVar {

	public static void main(String[] args) {


		String a ="Hello";
		String b ="World";
		
		
		
		//Append a and b
		
		a = a+b; // it will become HelloWorld
		
		//store initials string a into string b
		
		b = a.substring(0, a.length()-b.length()); // it will become "hello"
		
		//Store initial string b into string a
		
		a = a.substring(b.length()); // it will become "world"
		
		System.out.println("String After Swapping: ");
		
		System.out.println(a);
		System.out.println(b);
		
		
		
	}

}
