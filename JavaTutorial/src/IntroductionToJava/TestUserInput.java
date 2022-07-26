package IntroductionToJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

  class ReadUserInput {
	
	void useOfBufferedReader() throws IOException {
		
		System.out.println("Start Entering value");
		
		// Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
 
        // Reading data using readLine
        String name = reader.readLine();
 
        // Printing the read line
        System.out.println(name + "This is string");
        
		
	}
	
	@SuppressWarnings("resource")
	void useOfScannerClass() {
		
		 // Using Scanner for Getting Input from User
        
		System.out.println("Start Entering value");
		
		Scanner in = new Scanner(System.in);
 
        String s = in.nextLine();
        System.out.println("You entered string " + s);
 
        int a = in.nextInt();
        System.out.println("You entered integer " + a);
 
        float b = in.nextFloat();
        System.out.println("You entered float " + b);
	}
	
}	
	
	public class TestUserInput {

	public static void main(String[] args) throws IOException {

		ReadUserInput RUI = new ReadUserInput();
		RUI.useOfBufferedReader();
		RUI.useOfScannerClass();

	}

}
