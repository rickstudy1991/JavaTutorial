package IntroductionToJava;

import java.util.Scanner;

public class CalculatorSwitchCase {

	public static void main(String[] args) {
		
		int outputResult = 0;

		System.out.println("Please enter your choice");
		System.out.println("Addition: 1");
		System.out.println("Substraction: 2");
		System.out.println("Multiplication: 3");
		System.out.println("Division: 4");
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		 
		int userChoice = in.nextInt();
        
        System.out.println("Enter the first number");     
        int firstNumber = in.nextInt();
        
        System.out.println("Enter the second number");     
        int secondNumber = in.nextInt();
        
        switch (userChoice) {
        
        case 1:
        	outputResult =  firstNumber + secondNumber;
        	break;
        
        case 2:
        	outputResult =  firstNumber - secondNumber;
        	break;
        
        case 3:
        	outputResult =  firstNumber * secondNumber;
        	break;
        	
        case 4:
        	outputResult =  firstNumber / secondNumber;
        	break;
        	
        }
        
        System.out.print("Result is: ");
        System.out.println(outputResult);
        
	}

}
