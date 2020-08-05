package InnerClassConcept;

public class AnonymousInnerClass {

	
	public void show()
	{
		System.out.println("Base class show method");
		
	}
	
	
	
	public static void main(String[] args) {

		AnonymousInnerClass obj = new AnonymousInnerClass()
				{
		
		
						public void show()
							{
									System.out.println("Anonymous class method");
							}
			
			
				};
					obj.show();
		
		

	}

}
