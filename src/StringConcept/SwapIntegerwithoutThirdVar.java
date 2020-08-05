package StringConcept;

public class SwapIntegerwithoutThirdVar {

	public static void main(String[] args) {


		int x= 2;
		int y =1;
		
		System.out.println("Before Swap::");
		System.out.println(x);
		System.out.println(y);
		
		//Using + Operator
		//System.out.println("Using + Operator :");
		
		 x = x+y; //5+10=15
		 y = x-y; //15-10=5
		 x = x-y; //15-5=10 
		 
		 //Using * Operator
		 
		 x = x*y;
		 y = x/y;
		 x = x/y;
		 
		 //Using XOR Operator:^
		 
		 x = x^y;
		 y = x^y;
		 x = x^y;
		 
		 System.out.println("After Swap::");
		 System.out.println(x);
		 System.out.println(y);
		
		
		
	}

}
