
public class MOwith_exception1 extends MOwith_exception{
	
	public void test()
	{
		
		System.out.println("Child class method");
		throw new ArithmeticException();
		
	}
	
	

	public static void main(String[] args) {
		
		MOwith_exception1 obj = new MOwith_exception1(); // Static polymorphism or compile time polymorphism
		obj.test();
		obj.test2();
		
		MOwith_exception obj1 =new MOwith_exception(); 
		obj1.test();
		obj1.test2();
		
		MOwith_exception obj2 = new MOwith_exception1();  // Dynamic polymorphism or Runtime polymorphism
		obj2.test();
		obj.test2();
	}

}
