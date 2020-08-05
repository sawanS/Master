package StringConcept;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {


		int number[] = {-1,10,20,30,40,25,35,123};
		
		int smallest = number[0];
		int largest = number[0];
		
		for (int i=1; i<number.length;i++)
		{
			if(number[i]>largest)
			{
				largest = number[i];
			}
			
			else if(number[i]<smallest)
			{
				smallest = number[i];
			}
		}
		
		System.out.println("The Array is: "+Arrays.toString(number));
		System.out.println("The Smallest numbers are: "+smallest);

		System.out.println("The Largest numbers are: "+largest);

		
	}

}
