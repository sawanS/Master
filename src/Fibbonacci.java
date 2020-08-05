
public class Fibbonacci {
	
	public static void fib(int num)
	{
		System.out.println("The Fibbonacci series are::");
		int num1 =0,num2=1, num3=0; 
		System.out.println(num1);
		System.out.println(num2);
		
		for(int i=2;i<=num; i++)
		{
			num3 = num1 +num2;
			System.out.println(num3);
			num1=num2;
			num2  = num3;
			
		}
		
	}

	public static void main(String[] args) {
		fib(10);
	}
		
		


	}


