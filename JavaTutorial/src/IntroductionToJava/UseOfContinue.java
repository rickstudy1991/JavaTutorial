package IntroductionToJava;

// program to print only the odd numbers:

public class UseOfContinue {

	public static void main(String[] args) {
		
		System.out.println("Odd Numbers are:");
		
		for(int i= 1; i<=20; i++) {
			
			if(i%2 == 0) {
				continue;
			}
			else {
				
				System.out.print(i);
				System.out.print("  ");
			}
		}

	}

}
