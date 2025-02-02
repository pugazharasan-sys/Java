package BasicStructureOfJava;

public class Example2 {
	
// In class block we can create three members - Variables, Methods , Initializers
	
	//      main method ↓
	public static void main(String[] args) {
		
		System.out.println("This is variable value: "+a);
		display();

	}
	
	static int a ;  // Variables are container which is used to store data.
	
	// Methods are a block of instructions which is used to perform specific task
	public static void display() { 
		
		System.out.println("This is a method");
		
	}
	
	// Initializers are used to execute startup instruction
	static {
		System.out.println("I am initializer");
	}
	
}



// Note: A class can be executed only if the main method is create as given above
