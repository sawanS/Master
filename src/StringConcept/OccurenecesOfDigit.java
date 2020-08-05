package StringConcept;

public class OccurenecesOfDigit {

	public static void main(String[] args) {


		
		int[] num={1,2,2,2,2,3,4,5};
		int count =0;
		
		for(int i=0;i<num.length;i++)
		{
			
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					count++;
					System.out.println(num[i]);
					
					
				}
			}
			
			
			
		}
		System.out.println("Occurences are::"+count);
			
	}

}
