
public class PrimeNumberWithGenericMethod {

	
	
	public static boolean isPrime(int num)
	{
		
	
		
		if(num<=1)
		{
			return false;
		}
			
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
				//System.out.println("Not prime number");
			}
		}
		return true;
		
		
	}
	
	
	
	
	public static void main(String[] args) {

		System.out.println(isPrime(12));
		System.out.println(isPrime(23));		

	}

}
