
public class Encapsulation {

	
	//Encapsulation is also called as data hiding.
	// Wrapping of data into single class.
	//declare private variables so that no one can access these variables outside the class.
	//if variables are declared as private in the class then it won't be accesible from outside the class.
	
	private int age;
	private String name;
	
	
	//declare getter and setter method to access these private variables.
	
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	
	public static void main(String[] args) 
	
	
	{

		Encapsulation emp = new Encapsulation();
		emp.setAge(20);
		emp.setName("Sawan");
		
		System.out.println("Name is: "+emp.getName());
		System.out.println("Age is: "+emp.getAge());
		
		
		
		
		
	}

}
