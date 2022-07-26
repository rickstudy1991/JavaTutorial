package IntroductionToJava;

import java.util.Scanner;

public class ForEach_HighestMarks {
	
	int numberArray[];
	int studentCount;
	
	public ForEach_HighestMarks() {
		studentCount = 1;
		numberArray = new int[studentCount];
	}
	
	
	public void growArraySize() {
		int tempArray[] = new int[studentCount];
		for (int loopCounter = 0; loopCounter < numberArray.length; loopCounter++ ) {
			tempArray[loopCounter] = numberArray[loopCounter];		
		}
		numberArray = tempArray;
		
	}
	
	@SuppressWarnings("resource")
	public void addStudentNumber() {
		System.out.println("Enter Number:");
		Scanner s = new Scanner(System.in);
		numberArray[studentCount - 1] = s.nextInt();
		studentCount++;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int maxNumber = 0;
		
		ForEach_HighestMarks hm = new ForEach_HighestMarks();
		
		System.out.println("Do you wish to continue? Press Y if yes else press N");
		Scanner s1 = new Scanner(System.in);
		String userChoice = s1.nextLine();
		while(userChoice.equals("Y")) {
			hm.addStudentNumber();
			hm.growArraySize();
			
			System.out.println("Do you wish to continue? Press Y if yes else press N");
			Scanner s2 = new Scanner(System.in);
			userChoice = s2.nextLine();
		}
		
		for(int mainLoopCounter: hm.numberArray) {
			
			if(maxNumber < mainLoopCounter) {
				maxNumber = mainLoopCounter;
			}
			
		}
		System.out.println("Highest Number:");
		System.out.println(maxNumber);
	}
	
}