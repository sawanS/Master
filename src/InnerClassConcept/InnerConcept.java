package InnerClassConcept;

public class InnerConcept 
{
	
	
	int a;
	
	public void add()
	{
		System.out.println("Outer class method");
	}
	
	class B
	{
		
		int c;
		public void add()
		{
			System.out.println("Inner class method");
		}
		
	}

	public static void main(String[] args) {

		InnerConcept obj = new InnerConcept();
		/*System.out.println(obj.a=5);
		obj.add()*/;
		
		
		//inner class object initialization
		InnerConcept.B obj1 = obj.new B();
		
		System.out.println("Inner Class concept:");
		System.out.println(obj1.c=10);
		obj1.add();
	
		
		
		
		
	}

}
