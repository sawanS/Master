package StringConcept;

public class Countdigit {

	
		// This is modified and will commit to github
		// take some number and divide that number by 10 untill it becomes 0.
		// Increment the counter and print counter
		public static void main(String[] args)
		{
			
			int count =0;
			int num = 1234567;			
			 while(num!=0)
			 {
				 num =  num/10;
				 ++count;
			 }
			 System.out.println("Count for Given Digit is::"+count); // it will count the total digits from given number.
		}
		
	 
	
	
}
