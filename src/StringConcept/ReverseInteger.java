package StringConcept;

public class ReverseInteger {

	public static void main(String[] args) {


		int num = 123456;
	
		
		int reverse = 0;
		
		for (int i = 1; i <=6; i++) 
		{
			
			reverse = reverse*10 + num % 10;
		
			num = num/10;
		}
		System.out.println("Reverse integer is: "+reverse);
		
		//Using Stringbuffer concept
		
		long l1 = 123456;
		System.out.println("Reverse Integer Using String Buffer Concept: "+new StringBuffer(String.valueOf(l1)).reverse());
		
		
		//reverse the number using reverse method
		StringBuffer bf = new StringBuffer("123456");
		bf.reverse();
		System.out.println("Reverse integer using reverse method::"+bf);
		
	}

}
