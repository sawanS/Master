import java.util.Arrays;

public class Bubble1 {

	 void bubblesort(int num[]) {
	  //int temp=0;
		//int num[]={5,3,4,8,6,1};
		
		for(int i=0;i<num.length-1;i++)
		
			for(int j=0;j<num.length-1-i;j++)
			
				if(num[j]>num[j+1])
				{
					int temp=num[j];
					
					num[j]=num[j+1];
					num[j+1]=temp;
					
					
				}
					
	}
	
	void printArray(int num[])
	{
		
        for (int i=0; i<num.length; ++i) 
            System.out.print(num[i] + " "); 
        System.out.println(); 
	}

	public static void main(String[] args) 
	{
		
		
		
		Bubble1 ob=new Bubble1();
		int num[] = {1,8,4,3,5,7};
		ob.bubblesort(num);
		System.out.println("Sorted Array:");
		ob.printArray(num); 
	}

	
	
}
