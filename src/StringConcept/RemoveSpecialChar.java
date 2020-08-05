package StringConcept;

public class RemoveSpecialChar {

	public static void main(String[] args) {


		String s= "!@#$^&**&& Sawan Sharma123456 !@##$";
		
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));  //using regerx expression
		
		
	}

}
