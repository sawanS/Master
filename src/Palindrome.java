 
public class Palindrome {

	public void isPalindrome(int num) {

//141 454 
		
		System.out.print("Given Number is::"+num);
		
		int modulous =0; 
		int originalNumber;
		int sum=0;
		originalNumber= num;
		
		while(num>0)
		{
			modulous = num%10;
			sum = (sum*10)+modulous;
			
			num = num/10;
		}
		
		if(	originalNumber==sum)
		{
			System.out.println(" - Palindrome Number");
		}
		else
		{
			System.out.println(" - Not a Palindrome Number");
		}
		
	}
	
	public static void main(String[] args) {
		
		Palindrome ob = new Palindrome();
		ob.isPalindrome(133);
		ob.isPalindrome(121);
		ob.isPalindrome(131);
		
	}


}
