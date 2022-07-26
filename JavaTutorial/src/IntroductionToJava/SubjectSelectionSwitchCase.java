package IntroductionToJava;

import java.util.Scanner;

public class SubjectSelectionSwitchCase {

	
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {

		System.out.println("Welcome to STCET!!");
		System.out.println("Select your department - EE/CSE");
		Scanner in = new Scanner(System.in);
		
		String department = in.nextLine();
		
		switch (department) {
		
		case "EE":
			System.out.println("Choose your elective subject - Control System/Power System");
			String electiveEESubject = in.nextLine();
			
			switch (electiveEESubject) {
			
			case "Control System":
				System.out.println("Your elective Control System is approved!!");
				break;
			case "Power System":
				System.out.println("Your elective Power System is approved!!");
				break;
			}
			
			break;
			
		case "CSE":
			System.out.println("Choose your elective subject - AIML/CS");
			String electiveCSESubject = in.nextLine();
			
			switch (electiveCSESubject) {
			
			case "AIML":
				System.out.println("Your elective AIML is approved!!");
				break;
			case "CS":
				System.out.println("Your elective CS is approved!!");
				break;
							
			}
			
			break;
			
			default:
				System.out.println("Please select correct option");
			
		}
		

	}

}
