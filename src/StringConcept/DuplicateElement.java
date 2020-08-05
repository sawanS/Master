package StringConcept;

public class DuplicateElement

{

	public static void main(String[]args)
	{
		
		String[] str = {"java","c","java","c#"};
		
		//compare every string with each other
		
		System.out.println("Duplicates values are: ");
		
		for(int i =0; i<=str.length;i++)
		{
			for (int j=i+1; j<str.length;j++)
			{
				
				if(str[i].equals(str[j]))
				{
					System.out.println(str[i]);
				}
			}
		}
		
		
		
		
	}
	
	
}
