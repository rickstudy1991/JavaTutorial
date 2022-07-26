package IntroductionToJava;

/** 
 * Declaring float variable
   float simpleInterest; 

 * Declaring and initializing integer variable
   int time = 10, speed = 20; 
 
 * Declaring and initializing character variable 
   char var = 'h';
 
 * Types of Variables in Java:
   Local Variables = declares inside a method
   Instance Variables = outside a method and these are object specific
   Static Variables = belong to the class. Initialized only once at the start of the program execution
  
  
 * */

public class VaraiablesInJava {
	
	int data = 99;
	static int a = 1;
	
	void method() {
		
	int b = 95;
	System.out.println(b);
	
	}

	public static void main(String[] args) {
		
		VaraiablesInJava VIJ = new VaraiablesInJava();
		System.out.println("Local Variable:");
		VIJ.method();
		
		System.out.println("Static Variable:");
		System.out.println(a);
		
		System.out.println("Instance Variable:");
		System.out.println(VIJ.data);
		
		
		
	}

}
